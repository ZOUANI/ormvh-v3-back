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
        return statistiqueService.countCourrierByNatureClient();
    }

    @ApiOperation("countCourrierByExpeditorSex")
    @GetMapping("/countCourrierByExpeditorSex")
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex(){
        return statistiqueService.countCourrierByExpeditorSex();
    }

    @ApiOperation("countCourrierByDestinatorSex")
    @GetMapping("/countCourrierByDestinatorSex")
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex(){
        return statistiqueService.countCourrierByDestinatorSex();
    }
    @ApiOperation("countCourrierBySubject")
    @GetMapping("/countCourrierBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierBySubject(){
        return statistiqueService.countCourrierBySubject();
    }
    @ApiOperation("countCourrierByVoie")
    @GetMapping("/countCourrierByVoie")
    public Map<String, List<StatistiqueVo>> countCourrierByVoie(){
        return statistiqueService.countCourrierByVoie();
    }

    @ApiOperation("countCourrierByServiceEmeteur")
    @GetMapping("/countCourrierByServiceEmeteur")
    public Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur(){
        return statistiqueService.countCourrierByServiceEmeteur();
    }

    @ApiOperation("countCourrierByServiceCoord")
    @GetMapping("/countCourrierByServiceCoord")
    public Map<String, List<StatistiqueVo>> countCourrierByServiceCoord(){
        return statistiqueService.countCourrierByServiceCoord();
    }

    @ApiOperation("countCourrierByService")
    @GetMapping("/countCourrierByService")
    public Map<String, List<StatistiqueVo>> countCourrierByService(){
        return statistiqueService.countCourrierByService();
    }

    @ApiOperation("countCourrierByEtatEval")
    @GetMapping("/countCourrierByEtatEval")
    public Map<String, List<StatistiqueVo>> countCourrierByEtatEval(){
        return statistiqueService.countCourrierByEtatEval();
    }

    @ApiOperation("countCourrierAcceptedBySubject")
    @GetMapping("/countCourrierAcceptedBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject(){
        return statistiqueService.countCourrierAcceptedBySubject();
    }

    @ApiOperation("countCourrierRefusedBySubject")
    @GetMapping("/countCourrierRefusedBySubject")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject(){
        return statistiqueService.countCourrierRefusedBySubject();
    }

    @ApiOperation("countCourrierAcceptedByNatureClient")
    @GetMapping("/countCourrierAcceptedByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient(){
        return statistiqueService.countCourrierAcceptedByNatureClient();
    }

    @ApiOperation("countCourrierRefusedByNatureClient")
    @GetMapping("/countCourrierRefusedByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient(){
        return statistiqueService.countCourrierRefusedByNatureClient();
    }

    @ApiOperation("countCourrierRefusedByReason")
    @GetMapping("/countCourrierRefusedByReason")
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByReason(){
        return statistiqueService.countCourrierRefusedByReason();
    }

    @ApiOperation("countCourrierTraiteByServiceEmeteur")
    @GetMapping("/countCourrierTraiteByServiceEmeteur")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur(){
        return statistiqueService.countCourrierTraiteByServiceEmeteur();
    }

    @ApiOperation("countCourrierTraiteByServiceCoord")
    @GetMapping("/countCourrierTraiteByServiceCoord")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord(){
        return statistiqueService.countCourrierTraiteByServiceCoord();
    }

    @ApiOperation("countCourrierTraiteByNatureClient")
    @GetMapping("/countCourrierTraiteByNatureClient")
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient(){
        return statistiqueService.countCourrierTraiteByNatureClient();
    }

}
