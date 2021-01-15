package ma.zs.generated.ws.rest.provided.facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

import javax.mail.MessagingException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import ma.zs.generated.bean.CourrierPieceJointReponse;
import ma.zs.generated.bean.CourrierPieceJointTraite;
import ma.zs.generated.service.facade.CourrierPieceJointReponseService;
import ma.zs.generated.service.facade.CourrierPieceJointTraiteService;
import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.CourrierPieceJoint;
import ma.zs.generated.service.facade.CourrierPieceJointService;
import ma.zs.generated.service.facade.CourrierService;
import ma.zs.generated.service.impl.MediaTypeUtils;
import ma.zs.generated.service.util.DateUtil;
import ma.zs.generated.service.util.GeneratePdf;
import ma.zs.generated.ws.rest.provided.converter.CourrierConverter;
import ma.zs.generated.ws.rest.provided.vo.CourrierVo;
import ma.zs.generated.ws.rest.provided.vo.LeServiceVo;
import net.sf.jasperreports.engine.JRException;

@Api("Manages courrier services")
@RestController
@RequestMapping("generated/courrier")
public class CourrierRest {


    @Autowired
    private CourrierService courrierService;
    @Autowired
    private CourrierPieceJointService courrierPieceJointService;
    @Autowired
    private CourrierPieceJointTraiteService courrierPieceJointTraiteService;
    @Autowired
    private CourrierPieceJointReponseService courrierPieceJointReponseService;
    @Autowired
    private CourrierConverter courrierConverter;
    @Autowired
    private ServletContext servletContext;
    private ArrayList<CourrierPieceJoint> courrierPieceJoint = new ArrayList<CourrierPieceJoint>();


    public ArrayList<CourrierPieceJoint> getCourrierPieceJoint() {
        return courrierPieceJoint;
    }

    public void setCourrierPieceJoint(ArrayList<CourrierPieceJoint> courrierPieceJoint) {
        this.courrierPieceJoint = courrierPieceJoint;
    }

    @GetMapping("/downloadFile/{id}")
    public ResponseEntity<InputStreamResource> downloadFile(@PathVariable Long id, HttpServletResponse response) throws IOException, URISyntaxException {
        // Load file as Resource
        CourrierPieceJoint databaseFile = courrierPieceJointService.findById(id);
        File convFile = null;
        String newAbsoluteChemin = databaseFile.getAbsoluteChemin();
        StringBuilder sb = new StringBuilder(newAbsoluteChemin);
        for (int i = 0; i <= 6; i++) {
            sb.deleteCharAt(0);
        }
        newAbsoluteChemin = sb.toString();
        convFile = new File(newAbsoluteChemin);
        convFile.createNewFile();
        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, databaseFile.getChemin());
        InputStreamResource resource = new InputStreamResource(new FileInputStream(convFile));

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + convFile.getName())
                .contentType(mediaType)
                .contentLength(convFile.length()) //
                .body(resource);
    }

    @GetMapping("/downloadBlob/{id}")
    public byte[] downloadBlob(@PathVariable Long id) {
        CourrierPieceJoint cpj = courrierPieceJointService.findById(id);
        return cpj.getContenu();
    }

    @ApiOperation("creates the specified courrier")
    @PostMapping("/create")
    public int create(@RequestParam("file") MultipartFile file) {
        try {
            System.out.println(file.getOriginalFilename().split(".")[0]);
            this.courrierPieceJoint.add(new CourrierPieceJoint(null, file.getOriginalFilename().split(".")[0], file.getBytes(), file.getContentType(), null));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 1;
    }


    @ApiOperation("creates the specified courrier")
    @PostMapping("/")
    public int create(@RequestBody CourrierVo courrierVo) throws IOException {
        System.out.println("haaa courrierVo.getSentAt() = " + courrierVo.getSentAt());
        Courrier courrier = courrierConverter.toItem(courrierVo);
        Courrier loadedCourrier = courrierService.create(courrier);
        System.out.println("DateUtil.formateDate(courrier.getSentAt()) = " + DateUtil.formateDate(courrier.getSentAt()));
        return 1;
    }

    @ApiOperation("Delete the specified courrier")
    @DeleteMapping("/")
    public int delete(@RequestBody CourrierVo courrierVo) {
        Courrier courrier = courrierConverter.toItem(courrierVo);
        return courrierService.delete(courrier);
    }

    @ApiOperation("Updates the specified courrier")
    @PutMapping("/")
    public CourrierVo update(@RequestBody CourrierVo courrierVo) {
        Courrier courrier = courrierConverter.toItem(courrierVo);
        courrier = courrierService.update(courrier);
        return courrierConverter.toVo(courrier);
    }

    @ApiOperation("Finds a list of all courriers")
    @GetMapping("/")
    public List<CourrierVo> findAll() {
        return courrierConverter.toVo(courrierService.findAll());
    }

    @GetMapping("/findAllcourrierPieceJoint/{id}")
    public CourrierPieceJoint findAllcourrierPieceJoint(@PathVariable Long id) {
        return courrierPieceJointService.findByCourierId(id);
    }

    @ApiOperation("Finds a courrier by accuse")
    @GetMapping("/accuse/{accuse}")
    public List<CourrierVo> findByAccuse(@PathVariable Boolean accuse) {
        courrierConverter.init(false);
        return courrierConverter.toVo(courrierService.findByAccuse(accuse));
    }

    @ApiOperation("Finds a courrier by reponse")
    @GetMapping("/reponse/{reponse}")
    public List<CourrierVo> findByReponse(@PathVariable Boolean reponse) {
        courrierConverter.init(false);
        return courrierConverter.toVo(courrierService.findByReponse(reponse));
    }

    @ApiOperation("Finds a courrier by id")
    @GetMapping("/id/{id}")
    public CourrierVo findById(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findById(id));
    }

    @ApiOperation("Deletes a courrier by id")
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        courrierService.deleteById(id);
    }

    @ApiOperation("Finds a  courrier by idCourrier")
    @GetMapping("/idCourrier/{idCourrier}")
    public CourrierVo findByIdCourrier(@PathVariable String idCourrier) {
        return courrierConverter.toVo(courrierService.findByIdCourrier(idCourrier));
    }

    @ApiOperation("Deletes a  courrier by idCourrier")
    @DeleteMapping("/idCourrier/{idCourrier}")
    public int deleteByIdCourrier(@PathVariable String idCourrier) {
        return courrierService.deleteByIdCourrier(idCourrier);
    }


    @ApiOperation("Finds a courrier by title of courrierObject")
    @GetMapping("/courrierObject/title/{title}")
    public List<CourrierVo> findByCourrierObjectTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByCourrierObjectTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of courrierObject")
    @DeleteMapping("/courrierObject/title/{title}")
    public int deleteByCourrierObjectTitle(@PathVariable String title) {
        return courrierService.deleteByCourrierObjectTitle(title);
    }

    @ApiOperation("Finds courrier by id of courrierObject")
    @GetMapping("/courrierObject/id/{id}")
    public List<CourrierVo> findByCourrierObjectId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByCourrierObjectId(id));
    }

    @ApiOperation("Deletes courrier by id of courrierObject")
    @DeleteMapping("/courrierObject/id/{id}")
    public int deleteByCourrierObjectId(@PathVariable Long id) {
        return courrierService.deleteByCourrierObjectId(id);
    }

    @ApiOperation("Finds a courrier by libelle of voie")
    @GetMapping("/voie/libelle/{libelle}")
    public List<CourrierVo> findByVoieLibelle(@PathVariable String libelle) {
        return courrierConverter.toVo(courrierService.findByVoieLibelle(libelle));
    }

    @ApiOperation("Deletes a courrier by libelle of voie")
    @DeleteMapping("/voie/libelle/{libelle}")
    public int deleteByVoieLibelle(@PathVariable String libelle) {
        return courrierService.deleteByVoieLibelle(libelle);
    }

    @ApiOperation("Finds courrier by id of voie")
    @GetMapping("/voie/id/{id}")
    public List<CourrierVo> findByVoieId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByVoieId(id));
    }

    @ApiOperation("Deletes courrier by id of voie")
    @DeleteMapping("/voie/id/{id}")
    public int deleteByVoieId(@PathVariable Long id) {
        return courrierService.deleteByVoieId(id);
    }

    @ApiOperation("Finds a courrier by libelle of natureCourrier")
    @GetMapping("/natureCourrier/libelle/{libelle}")
    public List<CourrierVo> findByNatureCourrierLibelle(@PathVariable String libelle) {
        return courrierConverter.toVo(courrierService.findByNatureCourrierLibelle(libelle));
    }

    @ApiOperation("Deletes a courrier by libelle of natureCourrier")
    @DeleteMapping("/natureCourrier/libelle/{libelle}")
    public int deleteByNatureCourrierLibelle(@PathVariable String libelle) {
        return courrierService.deleteByNatureCourrierLibelle(libelle);
    }

    @ApiOperation("Finds courrier by id of natureCourrier")
    @GetMapping("/natureCourrier/id/{id}")
    public List<CourrierVo> findByNatureCourrierId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByNatureCourrierId(id));
    }

    @ApiOperation("Deletes courrier by id of natureCourrier")
    @DeleteMapping("/natureCourrier/id/{id}")
    public int deleteByNatureCourrierId(@PathVariable Long id) {
        return courrierService.deleteByNatureCourrierId(id);
    }

    @ApiOperation("Finds a courrier by idCourrier of linkedTo")
    @GetMapping("/linkedTo/idCourrier/{idCourrier}")
    public List<CourrierVo> findByLinkedToIdCourrier(@PathVariable String idCourrier) {
        return courrierConverter.toVo(courrierService.findByLinkedToIdCourrier(idCourrier));
    }

    @ApiOperation("Deletes a courrier by idCourrier of linkedTo")
    @DeleteMapping("/linkedTo/idCourrier/{idCourrier}")
    public int deleteByLinkedToIdCourrier(@PathVariable String idCourrier) {
        return courrierService.deleteByLinkedToIdCourrier(idCourrier);
    }

    @ApiOperation("Finds courrier by id of linkedTo")
    @GetMapping("/linkedTo/id/{id}")
    public Set<CourrierVo> findByLinkedToId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByLinkedToId(id));
    }

    @ApiOperation("Finds all linked courrier")
    @GetMapping("/linked/{id}")
    public Set<CourrierVo> findAllLinkd(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findAllLinked(id));
    }

    @ApiOperation("Deletes courrier by id of linkedTo")
    @DeleteMapping("/linkedTo/id/{id}")
    public int deleteByLinkedToId(@PathVariable Long id) {
        return courrierService.deleteByLinkedToId(id);
    }

    @ApiOperation("Finds a courrier by title of expeditor")
    @GetMapping("/expeditor/title/{title}")
    public List<CourrierVo> findByExpeditorTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByExpeditorTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of expeditor")
    @DeleteMapping("/expeditor/title/{title}")
    public int deleteByExpeditorTitle(@PathVariable String title) {
        return courrierService.deleteByExpeditorTitle(title);
    }

    @ApiOperation("Finds courrier by id of expeditor")
    @GetMapping("/expeditor/id/{id}")
    public List<CourrierVo> findByExpeditorId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByExpeditorId(id));
    }

    @ApiOperation("Deletes courrier by id of expeditor")
    @DeleteMapping("/expeditor/id/{id}")
    public int deleteByExpeditorId(@PathVariable Long id) {
        return courrierService.deleteByExpeditorId(id);
    }

    @ApiOperation("Finds a courrier by title of destinator")
    @GetMapping("/destinator/title/{title}")
    public List<CourrierVo> findByDestinatorTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByDestinatorTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of destinator")
    @DeleteMapping("/destinator/title/{title}")
    public int deleteByDestinatorTitle(@PathVariable String title) {
        return courrierService.deleteByDestinatorTitle(title);
    }

    @ApiOperation("Finds courrier by id of destinator")
    @GetMapping("/destinator/id/{id}")
    public List<CourrierVo> findByDestinatorId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByDestinatorId(id));
    }

    @ApiOperation("Deletes courrier by id of destinator")
    @DeleteMapping("/destinator/id/{id}")
    public int deleteByDestinatorId(@PathVariable Long id) {
        return courrierService.deleteByDestinatorId(id);
    }

    @ApiOperation("Finds a courrier by title of coordinator")
    @GetMapping("/coordinator/title/{title}")
    public List<CourrierVo> findByCoordinatorTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByCoordinatorTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of coordinator")
    @DeleteMapping("/coordinator/title/{title}")
    public int deleteByCoordinatorTitle(@PathVariable String title) {
        return courrierService.deleteByCoordinatorTitle(title);
    }

    @ApiOperation("Finds courrier by id of coordinator")
    @GetMapping("/coordinator/id/{id}")
    public List<CourrierVo> findByCoordinatorId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByCoordinatorId(id));
    }

    @ApiOperation("Deletes courrier by id of coordinator")
    @DeleteMapping("/coordinator/id/{id}")
    public int deleteByCoordinatorId(@PathVariable Long id) {
        return courrierService.deleteByCoordinatorId(id);
    }

    @ApiOperation("Finds a courrier by title of emetteur")
    @GetMapping("/emetteur/title/{title}")
    public List<CourrierVo> findByEmetteurTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByEmetteurTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of emetteur")
    @DeleteMapping("/emetteur/title/{title}")
    public int deleteByEmetteurTitle(@PathVariable String title) {
        return courrierService.deleteByEmetteurTitle(title);
    }

    @ApiOperation("Finds courrier by id of emetteur")
    @GetMapping("/emetteur/id/{id}")
    public List<CourrierVo> findByEmetteurId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByEmetteurId(id));
    }

    @ApiOperation("Deletes courrier by id of emetteur")
    @DeleteMapping("/emetteur/id/{id}")
    public int deleteByEmetteurId(@PathVariable Long id) {
        return courrierService.deleteByEmetteurId(id);
    }

    @ApiOperation("Finds a courrier by title of evaluation")
    @GetMapping("/evaluation/title/{title}")
    public List<CourrierVo> findByEvaluationTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByEvaluationTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of evaluation")
    @DeleteMapping("/evaluation/title/{title}")
    public int deleteByEvaluationTitle(@PathVariable String title) {
        return courrierService.deleteByEvaluationTitle(title);
    }

    @ApiOperation("Finds courrier by id of evaluation")
    @GetMapping("/evaluation/id/{id}")
    public List<CourrierVo> findByEvaluationId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByEvaluationId(id));
    }

    @ApiOperation("Deletes courrier by id of evaluation")
    @DeleteMapping("/evaluation/id/{id}")
    public int deleteByEvaluationId(@PathVariable Long id) {
        return courrierService.deleteByEvaluationId(id);
    }

    @ApiOperation("Finds a courrier by title of subdivision")
    @GetMapping("/subdivision/title/{title}")
    public List<CourrierVo> findBySubdivisionTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findBySubdivisionTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of subdivision")
    @DeleteMapping("/subdivision/title/{title}")
    public int deleteBySubdivisionTitle(@PathVariable String title) {
        return courrierService.deleteBySubdivisionTitle(title);
    }

    @ApiOperation("Finds courrier by id of subdivision")
    @GetMapping("/subdivision/id/{id}")
    public List<CourrierVo> findBySubdivisionId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findBySubdivisionId(id));
    }

    @ApiOperation("Deletes courrier by id of subdivision")
    @DeleteMapping("/subdivision/id/{id}")
    public int deleteBySubdivisionId(@PathVariable Long id) {
        return courrierService.deleteBySubdivisionId(id);
    }

    @ApiOperation("Finds a courrier by libelle of status")
    @GetMapping("/status/libelle/{libelle}")
    public List<CourrierVo> findByStatusLibelle(@PathVariable String libelle) {
        courrierConverter.init(false);
        return courrierConverter.toVo(courrierService.findByStatusLibelle(libelle));
    }

    @ApiOperation("Deletes a courrier by libelle of status")
    @DeleteMapping("/status/libelle/{libelle}")
    public int deleteByStatusLibelle(@PathVariable String libelle) {
        return courrierService.deleteByStatusLibelle(libelle);
    }

    @ApiOperation("Finds courrier by id of status")
    @GetMapping("/status/id/{id}")
    public List<CourrierVo> findByStatusId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByStatusId(id));
    }

    @ApiOperation("Deletes courrier by id of status")
    @DeleteMapping("/status/id/{id}")
    public int deleteByStatusId(@PathVariable Long id) {
        return courrierService.deleteByStatusId(id);
    }

    @ApiOperation("Finds a courrier by libelle of typeCourrier")
    @GetMapping("/typeCourrier/libelle/{libelle}")
    public List<CourrierVo> findByTypeCourrierLibelle(@PathVariable String libelle) {
        courrierConverter.init(false);
        return courrierConverter.toVo(courrierService.findByTypeCourrierLibelle(libelle));
    }

    @ApiOperation("Deletes a courrier by libelle of typeCourrier")
    @DeleteMapping("/typeCourrier/libelle/{libelle}")
    public int deleteByTypeCourrierLibelle(@PathVariable String libelle) {
        return courrierService.deleteByTypeCourrierLibelle(libelle);
    }

    @ApiOperation("Finds courrier by id of typeCourrier")
    @GetMapping("/typeCourrier/id/{id}")
    public List<CourrierVo> findByTypeCourrierId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByTypeCourrierId(id));
    }

    @ApiOperation("Deletes courrier by id of typeCourrier")
    @DeleteMapping("/typeCourrier/id/{id}")
    public int deleteByTypeCourrierId(@PathVariable Long id) {
        return courrierService.deleteByTypeCourrierId(id);
    }

    @ApiOperation("Finds a courrier by username of createdBy")
    @GetMapping("/createdBy/username/{username}")
    public List<CourrierVo> findByCreatedByUsername(@PathVariable String username) {
        return courrierConverter.toVo(courrierService.findByCreatedByUsername(username));
    }

    @ApiOperation("Deletes a courrier by username of createdBy")
    @DeleteMapping("/createdBy/username/{username}")
    public int deleteByCreatedByUsername(@PathVariable String username) {
        return courrierService.deleteByCreatedByUsername(username);
    }

    @ApiOperation("Finds courrier by id of createdBy")
    @GetMapping("/createdBy/id/{id}")
    public List<CourrierVo> findByCreatedById(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByCreatedById(id));
    }

    @ApiOperation("Deletes courrier by id of createdBy")
    @DeleteMapping("/createdBy/id/{id}")
    public int deleteByCreatedById(@PathVariable Long id) {
        return courrierService.deleteByCreatedById(id);
    }

    @ApiOperation("Finds a courrier by username of updatedBy")
    @GetMapping("/updatedBy/username/{username}")
    public List<CourrierVo> findByUpdatedByUsername(@PathVariable String username) {
        return courrierConverter.toVo(courrierService.findByUpdatedByUsername(username));
    }

    @ApiOperation("Deletes a courrier by username of updatedBy")
    @DeleteMapping("/updatedBy/username/{username}")
    public int deleteByUpdatedByUsername(@PathVariable String username) {
        return courrierService.deleteByUpdatedByUsername(username);
    }

    @ApiOperation("Finds courrier by id of updatedBy")
    @GetMapping("/updatedBy/id/{id}")
    public List<CourrierVo> findByUpdatedById(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByUpdatedById(id));
    }

    @ApiOperation("Deletes courrier by id of updatedBy")
    @DeleteMapping("/updatedBy/id/{id}")
    public int deleteByUpdatedById(@PathVariable Long id) {
        return courrierService.deleteByUpdatedById(id);
    }


    @ApiOperation("Search courrier by a specific criterion")
    @PostMapping("/search")
    public List<CourrierVo> findByCriteria(@RequestBody CourrierVo courrierVo) {
        return courrierConverter.toVo(courrierService.findByCriteria(courrierVo));
    }

    @GetMapping("/generateId")
    public String generateIdCourrier() {
        return courrierService.generateIdCourrier();
    }

    @PostMapping("/courriers/reservation/idCourier/{idCourier}/nbr/{nbr}/description/{description}")
    public int reservation(@RequestBody Courrier courrier, @PathVariable String idCourier, @PathVariable int nbr, @PathVariable String description) {
        return courrierService.reservation(courrier, idCourier, nbr, description);
    }

    @ApiOperation("get all stats")
    @GetMapping("/stats/dateMin/{dateMin}/dateMax/{dateMax}/titleCoordinator/{titleCoordinator}")
    public List<Long> getStat(@PathVariable String dateMin, @PathVariable String dateMax, @PathVariable String titleCoordinator) {
        return courrierService.getStat(DateUtil.parse(dateMin), DateUtil.parse(dateMax), titleCoordinator);
    }

    @ApiOperation("Count all courriers")
    @GetMapping("/countAll")
    public long count() {
        return courrierService.count();
    }

    @ApiOperation("Count by TypeCourrier")
    @GetMapping("/countTypeCourrier/typeCourrier_libelle/{typeCourrier_libelle}")
    public Long countByTypeCourrierLibelle(@PathVariable String typeCourrier_libelle) {
        return courrierService.countByTypeCourrierLibelle(typeCourrier_libelle);
    }

    @ApiOperation("Count by staus")
    @GetMapping("/countStatus/libelle/{libelle}")
    public Long countByStatusLibelle(@PathVariable String libelle) {
        return courrierService.countByStatusLibelle(libelle);
    }

    @ApiOperation("Count accused courriers")
    @GetMapping("/countAccused/accuse/{accuse}")
    public Long countByAccuse(@PathVariable Boolean accuse) {
        return courrierService.countByAccuse(accuse);
    }

    @ApiOperation("Count responed courriers")
    @GetMapping("/countResponse/reponse/{reponse}")
    public Long countByReponse(@PathVariable Boolean reponse) {
        return courrierService.countByReponse(reponse);
    }

    @ApiOperation("Finds courriers by createdAt")
    @GetMapping("/createdAt/{createdAt}")
    public Long findByCreatedAt(@PathVariable String createdAt) {
        return courrierService.countByCreatedAt(DateUtil.parse(createdAt));
    }

    @ApiOperation("Finds courriers between 2 createdAt")
    @GetMapping("/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public Long findByCreatedAtBetween(@PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierService.countByCreatedAtBetween(DateUtil.parse(createdAt), DateUtil.parse(createdAt2));
    }

    @ApiOperation("Finds courriers by type and createdAt")
    @GetMapping("/typeCourrier_libelle/{typeCourrier_libelle}/createdAt/{createdAt}")
    public Long findByTypeCourrierLibelleAndCreatedAt(@PathVariable String typeCourrier_libelle, @PathVariable String createdAt) {
        return courrierService.countByTypeCourrierLibelleAndCreatedAt(typeCourrier_libelle, DateUtil.parse(createdAt));
    }

    @ApiOperation("Finds courriers by type and between 2 createdAt")
    @GetMapping("/typeCourrier_libelle/{typeCourrier_libelle}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public Long findByTypeCourrierLibelleAndCreatedAtBetween(@PathVariable String typeCourrier_libelle, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierService.countByTypeCourrierLibelleAndCreatedAtBetween(typeCourrier_libelle, DateUtil.parse(createdAt), DateUtil.parse(createdAt2));
    }

    @ApiOperation("Finds courriers by Accuse and createdAt")
    @GetMapping("/accuse/{accuse}/createdAt/{createdAt}")
    public Long findByAccuseAndCreatedAt(@PathVariable Boolean accuse, @PathVariable String createdAt) {
        return courrierService.countByAccuseAndCreatedAt(accuse, DateUtil.parse(createdAt));
    }

    @ApiOperation("Finds courriers by accuse and between 2 createdAt")
    @GetMapping("/accuse/{accuse}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public Long findByAccuseAndCreatedAtBetween(@PathVariable Boolean accuse, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierService.countByAccuseAndCreatedAtBetween(accuse, DateUtil.parse(createdAt), DateUtil.parse(createdAt2));
    }

    @ApiOperation("Finds courriers by reponse and createdAt")
    @GetMapping("/reponse/{reponse}/createdAt/{createdAt}")
    public Long findByReponseAndCreatedAt(@PathVariable Boolean reponse, @PathVariable String createdAt) {
        return courrierService.countByReponseAndCreatedAt(reponse, DateUtil.parse(createdAt));
    }

    @ApiOperation("Finds courriers by reponse and between 2 createdAt")
    @GetMapping("/reponse/{reponse}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public Long findByReponseAndCreatedAtBetween(@PathVariable Boolean reponse, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierService.countByReponseAndCreatedAtBetween(reponse, DateUtil.parse(createdAt), DateUtil.parse(createdAt2));
    }

    @ApiOperation("Finds courriers by status and createdAt")
    @GetMapping("/status_libelle/{status_libelle}/createdAt/{createdAt}")
    public Long findByStatusLibelleAndCreatedAt(@PathVariable String status_libelle, @PathVariable String createdAt) {
        return courrierService.countByStatusLibelleAndCreatedAt(status_libelle, DateUtil.parse(createdAt));
    }

    @ApiOperation("Finds courriers by status_libelle and between 2 createdAt")
    @GetMapping("/status_libelle/{status_libelle}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public Long findByStatusLibelleAndCreatedAtBetween(@PathVariable String status_libelle, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierService.countByStatusLibelleAndCreatedAtBetween(status_libelle, DateUtil.parse(createdAt), DateUtil.parse(createdAt2));
    }

    @ApiOperation("verify idCourier")
    @GetMapping("/verify/IdCourier/{IdCourier}")
    public String verifyIdCourier(@PathVariable String IdCourier) {
        return courrierService.verifyIdCourier(IdCourier);
    }


    public CourrierConverter getCourrierConverter() {
        return courrierConverter;
    }

    public void setCourrierConverter(CourrierConverter courrierConverter) {
        this.courrierConverter = courrierConverter;
    }

    public CourrierService getCourrierService() {
        return courrierService;
    }

    public void setCourrierService(CourrierService courrierService) {
        this.courrierService = courrierService;
    }

    @PostMapping("/couriersusceptiblerelance")
    public Map<LeServiceVo, List<CourrierVo>> findCourrierSusceptibleRelance(@RequestBody CourrierVo courrierVo) {
        return courrierConverter.convertMapToVo(courrierService.findCourrierSusceptibleRelance(courrierVo));
    }

    @PostMapping("/sendcourierredirection/to/{to}/subject/{subject}/content/{content}")
    public int sendCourrierRedirection(@PathVariable String to, @PathVariable String subject, @PathVariable String content) throws MessagingException {
        return courrierService.sendCourrierRedirection(to, subject, content);
    }

    @PostMapping("/sendcourierrelance")
    public int sendCourrierRelance(@RequestBody List<CourrierVo> courrierVos) throws MessagingException {
        return courrierService.sendCourrierRelance(courrierConverter.toItem(courrierVos));
    }

    @PostMapping("/pdf")
    public ResponseEntity<Object> CommandePrint(@RequestBody List<CourrierVo> courriers) throws IOException, JRException {
        List<Courrier> toPrint = new ArrayList<>();
        for (CourrierVo courrier : courriers) {
            toPrint.add(courrierService.findByIdCourrier(courrier.getIdCourrier()));
        }
        Map<String, Object> parameters = new HashMap<>();
        return GeneratePdf.generatePdfs("courriers", parameters, toPrint, "/reports/courriers.jasper");
    }

    @PostMapping("/upload/{idCourrier}")
    public int uploadFiles(@RequestParam("files") List<MultipartFile> files, @PathVariable String idCourrier) throws IOException {
        return courrierService.uploadFiles(files, idCourrier);
    }

    @PostMapping("/uploadTraite/{idCourrier}")
    public int uploadFilesTraite(@RequestParam("files") List<MultipartFile> files, @PathVariable String idCourrier) throws IOException {
        return courrierService.uploadFilesTraite(files, idCourrier);
    }
    @PostMapping("/uploadReponse/{idCourrier}")
    public int uploadFilesReponse(@RequestParam("files") List<MultipartFile> files, @PathVariable String idCourrier) throws IOException {
        return courrierService.uploadFilesReponse(files, idCourrier);
    }

    @GetMapping("/searchbyCourrierid/{id}")
    public List<CourrierPieceJoint> searchByCourrierId(@PathVariable Long id) {
        List<CourrierPieceJoint> courrierPieceJoints=this.courrierPieceJointService.searchByCourierId(id);
        for (CourrierPieceJoint c:courrierPieceJoints
             ) {
            c.setCourier(null);
        }
        return courrierPieceJoints;
    }

    @GetMapping("/searchbyCourrieridTraite/{id}")
    public List<CourrierPieceJointTraite> searchByCourrierIdTraite(@PathVariable Long id) {
        List<CourrierPieceJointTraite> courrierPieceJoints=this.courrierPieceJointTraiteService.searchByCourierId(id);
        for (CourrierPieceJointTraite c:courrierPieceJoints
        ) {
            c.setCourier(null);
        }
        return courrierPieceJoints;

    }
    @GetMapping("/searchbyCourrieridReponse/{id}")
    public List<CourrierPieceJointReponse> searchByCourrierIdReponse(@PathVariable Long id) {
        List<CourrierPieceJointReponse> courrierPieceJoints=this.courrierPieceJointReponseService.searchByCourierId(id);
        for (CourrierPieceJointReponse c:courrierPieceJoints
        ) {
            c.setCourier(null);
        }
        return courrierPieceJoints;

    }

    @DeleteMapping("/piecejointid/{id}")
    public void deletePieceJointById(@PathVariable Long id) {
        this.courrierPieceJointService.deleteById(id);
    }

    @DeleteMapping("/piecejointTraiteid/{id}")
    public void deletePieceJointTraiteById(@PathVariable Long id) {
        this.courrierPieceJointTraiteService.deleteById(id);
    }
    @DeleteMapping("/piecejointReponseid/{id}")
    public void deletePieceJointReponseById(@PathVariable Long id) {
        this.courrierPieceJointReponseService.deleteById(id);
    }


}