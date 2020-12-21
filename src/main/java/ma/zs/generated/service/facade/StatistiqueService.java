package ma.zs.generated.service.facade;

import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;

import java.util.List;
import java.util.Map;

public interface StatistiqueService {
    Map<String, List<StatistiqueVo>> countCourrierByNatureClient();

    Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex();

    Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex();

    Map<String, List<StatistiqueVo>> countCourrierBySubject();

    Map<String, List<StatistiqueVo>> countCourrierByVoie();

    Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur();

    Map<String, List<StatistiqueVo>> countCourrierByServiceCoord();

    Map<String, List<StatistiqueVo>> countCourrierByService();

    Map<String, List<StatistiqueVo>> countCourrierByEtatEval();

    Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject();

    Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject();

    Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient();

    Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient();

    Map<String, List<StatistiqueVo>> countCourrierRefusedByReason();

    Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur();

    Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord();

    Map<String, List<StatistiqueVo>> countCourrierTraiteByService();

    Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient();
}
