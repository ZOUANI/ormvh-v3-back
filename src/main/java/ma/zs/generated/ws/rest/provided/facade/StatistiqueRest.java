package ma.zs.generated.ws.rest.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.service.facade.StatistiqueService;
import ma.zs.generated.service.util.DateUtil;
import ma.zs.generated.ws.rest.provided.vo.ExpeditorVo;
import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Api("Manages courrier stat")
@RestController
@RequestMapping("generated/statistique")
public class StatistiqueRest {
    @Autowired
    private StatistiqueService statistiqueService;

    @ApiOperation("countCourrierByNatureClient")
    @PostMapping("/countCourrierByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierByNatureClient(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByNatureClient(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByExpeditorSex")
    @PostMapping("/countCourrierByExpeditorSex")
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByExpeditorSex(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByDestinatorSex")
    @PostMapping("/countCourrierByDestinatorSex")
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByDestinatorSex(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByDestinatorTrancheAge")
    @PostMapping("/countCourrierByDestinatorTrancheAge")
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorTrancheAge(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByDestinatorTrancheAge(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByExpeditorTrancheAge")
    @PostMapping("/countCourrierByExpeditorTrancheAge")
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorTrancheAge(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByExpeditorTrancheAge(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByExpeditorNationality")
    @PostMapping("/countCourrierByExpeditorNationality")
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorNationality(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByExpeditorNationality(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByDestinatorNationality")
    @PostMapping("/countCourrierByDestinatorNationality")
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorNationality(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByDestinatorNationality(dateMin, dateMax);
    }

    @ApiOperation("countCourrierBySubject")
    @PostMapping("/countCourrierBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierBySubject(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierBySubject(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByVoie")
    @PostMapping("/countCourrierByVoie")
    public Map<String, List<StatistiqueVo>> countCourrierByVoie(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByVoie(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByServiceEmeteur")
    @PostMapping("/countCourrierByServiceEmeteur")
    public Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByServiceEmeteur(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByServiceCoord")
    @PostMapping("/countCourrierByServiceCoord")
    public Map<String, List<StatistiqueVo>> countCourrierByServiceCoord(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByServiceCoord(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByService")
    @PostMapping("/countCourrierByService")
    public Map<String, List<StatistiqueVo>> countCourrierByService(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByService(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByEtatEval")
    @PostMapping("/countCourrierByEtatEval")
    public Map<String, List<StatistiqueVo>> countCourrierByEtatEval(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByEtatEval(dateMin, dateMax);
    }

    @ApiOperation("countCourrierAcceptedBySubject")
    @PostMapping("/countCourrierAcceptedBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierAcceptedBySubject(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRefusedBySubject")
    @PostMapping("/countCourrierRefusedBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRefusedBySubject(dateMin, dateMax);
    }

    @ApiOperation("countCourrierAcceptedByNatureClient")
    @PostMapping("/countCourrierAcceptedByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierAcceptedByNatureClient(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRefusedByNatureClient")
    @PostMapping("/countCourrierRefusedByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRefusedByNatureClient(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRefusedByReason")
    @PostMapping("/countCourrierRefusedByReason")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByReason(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRefusedByReason(dateMin, dateMax);
    }

    @ApiOperation("countCourrierTraiteByServiceEmeteur")
    @PostMapping("/countCourrierTraiteByServiceEmeteur")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierTraiteByServiceEmeteur(dateMin, dateMax);
    }

    @ApiOperation("countCourrierTraiteByServiceCoord")
    @PostMapping("/countCourrierTraiteByServiceCoord")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierTraiteByServiceCoord(dateMin, dateMax);
    }

    @ApiOperation("countCourrierTraiteByNatureClient")
    @PostMapping("/countCourrierTraiteByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierTraiteByNatureClient(dateMin, dateMax);
    }

    @ApiOperation("countCourrierTraiteByService")
    @PostMapping("/countCourrierTraiteByService")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByService(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierTraiteByService(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRejeteNonConformeReponduByService")
    @PostMapping("/countCourrierRejeteNonConformeReponduByService")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByService(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRejeteNonConformeReponduByService(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRejeteNonConformeReponduByNatureClient")
    @PostMapping("/countCourrierRejeteNonConformeReponduByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByNatureClient(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRejeteNonConformeReponduByNatureClient(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRejeteNonConformeSansReponceByService")
    @PostMapping("/countCourrierRejeteNonConformeSansReponceByService")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByService(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRejeteNonConformeSansReponceByService(dateMin, dateMax);
    }

    @ApiOperation("countCourrierRejeteNonConformeSansReponceByNatureClient")
    @PostMapping("/countCourrierRejeteNonConformeSansReponceByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByNatureClient(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierRejeteNonConformeSansReponceByNatureClient(dateMin, dateMax);
    }

    @ApiOperation("countCourrierByPhaseAdministrative")
    @PostMapping("/countCourrierByPhaseAdministrative")
    public Map<String, List<StatistiqueVo>> countCourrierByPhaseAdministrative(@RequestBody StatistiqueVo statistiqueVo) {
        Date dateMin = DateUtil.convert(statistiqueVo.getDateMin());
        Date dateMax = DateUtil.convert(statistiqueVo.getDateMax());
        return statistiqueService.countCourrierByPhaseAdministrative(dateMin, dateMax);
    }


}
