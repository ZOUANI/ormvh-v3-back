package ma.zs.generated.ws.rest.provided.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.service.facade.StatistiqueService;
import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Api("Manages courrier stat")
@RestController
@RequestMapping("generated/statistique")
public class StatistiqueRest {
    @Autowired
    private StatistiqueService statistiqueService;

    @ApiOperation("countCourrierByNatureClient")
    @GetMapping("/countCourrierByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierByNatureClient(){
        return statistiqueService.countCourrierByNatureClient(null,null);
    }

    @ApiOperation("countCourrierByExpeditorSex")
    @GetMapping("/countCourrierByExpeditorSex")
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex(){
        return statistiqueService.countCourrierByExpeditorSex(null,null);
    }

    @ApiOperation("countCourrierByDestinatorSex")
    @GetMapping("/countCourrierByDestinatorSex")
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex(){
        return statistiqueService.countCourrierByDestinatorSex(null,null);
    }

    @ApiOperation("countCourrierByDestinatorTrancheAge")
    @GetMapping("/countCourrierByDestinatorTrancheAge")
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorTrancheAge(){
        return statistiqueService.countCourrierByDestinatorTrancheAge(null,null);
    }

    @ApiOperation("countCourrierByExpeditorTrancheAge")
    @GetMapping("/countCourrierByExpeditorTrancheAge")
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorTrancheAge(){
        return statistiqueService.countCourrierByExpeditorTrancheAge(null,null);
    }

    @ApiOperation("countCourrierBySubject")
    @GetMapping("/countCourrierBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierBySubject(){
        return statistiqueService.countCourrierBySubject(null,null);
    }
    @ApiOperation("countCourrierByVoie")
    @GetMapping("/countCourrierByVoie")
    public Map<String, List<StatistiqueVo>> countCourrierByVoie(){
        return statistiqueService.countCourrierByVoie(null,null);
    }

    @ApiOperation("countCourrierByServiceEmeteur")
    @GetMapping("/countCourrierByServiceEmeteur")
    public Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur(){
        return statistiqueService.countCourrierByServiceEmeteur(null,null);
    }

    @ApiOperation("countCourrierByServiceCoord")
    @GetMapping("/countCourrierByServiceCoord")
    public Map<String, List<StatistiqueVo>> countCourrierByServiceCoord(){
        return statistiqueService.countCourrierByServiceCoord(null,null);
    }

    @ApiOperation("countCourrierByService")
    @GetMapping("/countCourrierByService")
    public Map<String, List<StatistiqueVo>> countCourrierByService(){
        return statistiqueService.countCourrierByService(null,null);
    }

    @ApiOperation("countCourrierByEtatEval")
    @GetMapping("/countCourrierByEtatEval")
    public Map<String, List<StatistiqueVo>> countCourrierByEtatEval(){
        return statistiqueService.countCourrierByEtatEval(null,null);
    }

    @ApiOperation("countCourrierAcceptedBySubject")
    @GetMapping("/countCourrierAcceptedBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject(){
        return statistiqueService.countCourrierAcceptedBySubject(null,null);
    }

    @ApiOperation("countCourrierRefusedBySubject")
    @GetMapping("/countCourrierRefusedBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject(){
        return statistiqueService.countCourrierRefusedBySubject(null,null);
    }

    @ApiOperation("countCourrierAcceptedByNatureClient")
    @GetMapping("/countCourrierAcceptedByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient(){
        return statistiqueService.countCourrierAcceptedByNatureClient(null,null);
    }

    @ApiOperation("countCourrierRefusedByNatureClient")
    @GetMapping("/countCourrierRefusedByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient(){
        return statistiqueService.countCourrierRefusedByNatureClient(null,null);
    }

    @ApiOperation("countCourrierRefusedByReason")
    @GetMapping("/countCourrierRefusedByReason")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByReason(){
        return statistiqueService.countCourrierRefusedByReason(null,null);
    }

    @ApiOperation("countCourrierTraiteByServiceEmeteur")
    @GetMapping("/countCourrierTraiteByServiceEmeteur")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur(){
        return statistiqueService.countCourrierTraiteByServiceEmeteur(null,null);
    }

    @ApiOperation("countCourrierTraiteByServiceCoord")
    @GetMapping("/countCourrierTraiteByServiceCoord")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord(){
        return statistiqueService.countCourrierTraiteByServiceCoord(null,null);
    }

    @ApiOperation("countCourrierTraiteByNatureClient")
    @GetMapping("/countCourrierTraiteByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient(){
        return statistiqueService.countCourrierTraiteByNatureClient(null,null);
    }

    @ApiOperation("countCourrierTraiteByService")
    @GetMapping("/countCourrierTraiteByService")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByService(){
        return statistiqueService.countCourrierTraiteByService(null,null);
    }

    @ApiOperation("countCourrierRejeteNonConformeReponduByService")
    @GetMapping("/countCourrierRejeteNonConformeReponduByService")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByService(){
        return statistiqueService.countCourrierRejeteNonConformeReponduByService(null,null);
    }

    @ApiOperation("countCourrierRejeteNonConformeReponduByNatureClient")
    @GetMapping("/countCourrierRejeteNonConformeReponduByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByNatureClient(){
        return statistiqueService.countCourrierRejeteNonConformeReponduByNatureClient(null,null);
    }

    @ApiOperation("countCourrierRejeteNonConformeSansReponceByService")
    @GetMapping("/countCourrierRejeteNonConformeSansReponceByService")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByService(){
        return statistiqueService.countCourrierRejeteNonConformeSansReponceByService(null,null);
    }

    @ApiOperation("countCourrierRejeteNonConformeSansReponceByNatureClient")
    @GetMapping("/countCourrierRejeteNonConformeSansReponceByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByNatureClient(){
        return statistiqueService.countCourrierRejeteNonConformeSansReponceByNatureClient(null,null);
    }


}
