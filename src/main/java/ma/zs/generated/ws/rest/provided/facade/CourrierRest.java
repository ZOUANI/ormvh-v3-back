package ma.zs.generated.ws.rest.provided.facade;

import java.util.Date;
import java.util.List;

import ma.zs.generated.service.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.Courrier;
import ma.zs.generated.service.facade.CourrierService;
import ma.zs.generated.ws.rest.provided.converter.CourrierConverter;
import ma.zs.generated.ws.rest.provided.vo.CourrierVo;

@Api("Manages courrier services")
@RestController
@RequestMapping("generated/courrier")
public class CourrierRest {


    @Autowired
    private CourrierService courrierService;

    @Autowired
    private CourrierConverter courrierConverter;


    public Long countByAccuse(Boolean accuse) {
        return courrierService.countByAccuse(accuse);
    }

    public Long countByReponse(Boolean accuse) {
        return courrierService.countByReponse(accuse);
    }

    @ApiOperation("creates the specified courrier")
    @PostMapping("/")
    public CourrierVo create(@RequestBody CourrierVo courrierVo) {
        Courrier courrier = courrierConverter.toItem(courrierVo);
        courrier = courrierService.create(courrier);
        return courrierConverter.toVo(courrier);
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

    @ApiOperation("Finds a courrier by accuse")
    @GetMapping("/accuse/{accuse}")
    public List<CourrierVo> findByAccuse(@PathVariable Boolean accuse) {
        return courrierConverter.toVo(courrierService.findByAccuse(accuse));
    }

    @ApiOperation("Finds a courrier by reponse")
    @GetMapping("/reponse/{reponse}")
    public List<CourrierVo> findByReponse(@PathVariable Boolean reponse) {
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
    public List<CourrierVo> findByLinkedToId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByLinkedToId(id));
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

    @ApiOperation("Finds a courrier by title of expeditorType")
    @GetMapping("/expeditorType/title/{title}")
    public List<CourrierVo> findByExpeditorTypeTitle(@PathVariable String title) {
        return courrierConverter.toVo(courrierService.findByExpeditorTypeTitle(title));
    }

    @ApiOperation("Deletes a courrier by title of expeditorType")
    @DeleteMapping("/expeditorType/title/{title}")
    public int deleteByExpeditorTypeTitle(@PathVariable String title) {
        return courrierService.deleteByExpeditorTypeTitle(title);
    }

    @ApiOperation("Finds courrier by id of expeditorType")
    @GetMapping("/expeditorType/id/{id}")
    public List<CourrierVo> findByExpeditorTypeId(@PathVariable Long id) {
        return courrierConverter.toVo(courrierService.findByExpeditorTypeId(id));
    }

    @ApiOperation("Deletes courrier by id of expeditorType")
    @DeleteMapping("/expeditorType/id/{id}")
    public int deleteByExpeditorTypeId(@PathVariable Long id) {
        return courrierService.deleteByExpeditorTypeId(id);
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

    @PostMapping("/courriers/reservation/idCourier/{idCourier}/nbr/{nbr}")
    public int reservation(@RequestBody Courrier courrier, @PathVariable String idCourier, @PathVariable int nbr) {
        return courrierService.reservation(courrier, idCourier, nbr);
    }

    @ApiOperation("Finds courriers by createdAt")
    @GetMapping("/createdAt/{createdAt}")
    public List<CourrierVo> findByCreatedAt(@PathVariable String createdAt) {
        System.out.println(createdAt);
        System.out.println(DateUtil.parse(createdAt));
        return courrierConverter.toVo(courrierService.findByCreatedAt(DateUtil.parse(createdAt)));
    }

    @ApiOperation("Finds courriers between 2 createdAt")
    @GetMapping("/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public List<CourrierVo> findByCreatedAtBetween(@PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierConverter.toVo(courrierService.findByCreatedAtBetween(DateUtil.parse(createdAt), DateUtil.parse(createdAt2)));
    }

    @ApiOperation("Finds courriers by type and createdAt")
    @GetMapping("/typeCourrier_libelle/{typeCourrier_libelle}/createdAt/{createdAt}")
    public List<CourrierVo> findByTypeCourrierLibelleAndCreatedAt(@PathVariable String typeCourrier_libelle, @PathVariable String createdAt) {
        return courrierConverter.toVo(courrierService.findByTypeCourrierLibelleAndCreatedAt(typeCourrier_libelle, DateUtil.parse(createdAt)));
    }

    @ApiOperation("Finds courriers by type and between 2 createdAt")
    @GetMapping("/typeCourrier_libelle/{typeCourrier_libelle}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public List<CourrierVo> findByTypeCourrierLibelleAndCreatedAtBetween(@PathVariable String typeCourrier_libelle, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierConverter.toVo(courrierService.findByTypeCourrierLibelleAndCreatedAtBetween(typeCourrier_libelle, DateUtil.parse(createdAt), DateUtil.parse(createdAt2)));
    }

    @ApiOperation("Finds courriers by Accuse and createdAt")
    @GetMapping("/accuse/{accuse}/createdAt/{createdAt}")
    public List<CourrierVo> findByAccuseAndCreatedAt(@PathVariable Boolean accuse, @PathVariable String createdAt) {
        return courrierConverter.toVo(courrierService.findByAccuseAndCreatedAt(accuse, DateUtil.parse(createdAt)));
    }

    @ApiOperation("Finds courriers by accuse and between 2 createdAt")
    @GetMapping("/accuse/{accuse}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public List<CourrierVo> findByAccuseAndCreatedAtBetween(@PathVariable Boolean accuse, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierConverter.toVo(courrierService.findByAccuseAndCreatedAtBetween(accuse, DateUtil.parse(createdAt), DateUtil.parse(createdAt2)));
    }

    @ApiOperation("Finds courriers by reponse and createdAt")
    @GetMapping("/reponse/{reponse}/createdAt/{createdAt}")
    public List<CourrierVo> findByReponseAndCreatedAt(@PathVariable Boolean reponse, @PathVariable String createdAt) {
        return courrierConverter.toVo(courrierService.findByReponseAndCreatedAt(reponse, DateUtil.parse(createdAt)));
    }

    @ApiOperation("Finds courriers by reponse and between 2 createdAt")
    @GetMapping("/reponse/{reponse}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public List<CourrierVo> findByReponseAndCreatedAtBetween(@PathVariable Boolean reponse, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierConverter.toVo(courrierService.findByReponseAndCreatedAtBetween(reponse, DateUtil.parse(createdAt), DateUtil.parse(createdAt2)));
    }

    @ApiOperation("Finds courriers by status and createdAt")
    @GetMapping("/status_libelle/{status_libelle}/createdAt/{createdAt}")
    public List<CourrierVo> findByStatusLibelleAndCreatedAt(@PathVariable String status_libelle, @PathVariable String createdAt) {
        return courrierConverter.toVo(courrierService.findByStatusLibelleAndCreatedAt(status_libelle, DateUtil.parse(createdAt)));
    }

    @ApiOperation("Finds courriers by status_libelle and between 2 createdAt")
    @GetMapping("/status_libelle/{status_libelle}/createdAt/{createdAt}/createdAt2/{createdAt2}")
    public List<CourrierVo> findByStatusLibelleAndCreatedAtBetween(@PathVariable String status_libelle, @PathVariable String createdAt, @PathVariable String createdAt2) {
        return courrierConverter.toVo(courrierService.findByStatusLibelleAndCreatedAtBetween(status_libelle, DateUtil.parse(createdAt), DateUtil.parse(createdAt2)));
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


}