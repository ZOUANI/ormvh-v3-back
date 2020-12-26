package ma.zs.generated.service.facade;

import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StatistiqueService {
    Map<String, List<StatistiqueVo>> countCourrierByNatureClient(Date dateMin, Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByDestinatorTrancheAge(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByExpeditorTrancheAge(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierBySubject(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByVoie(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByServiceCoord(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByService(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierByEtatEval(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRefusedByReason(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierTraiteByService(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient(Date dateMin,Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByService(Date dateMin, Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByNatureClient(Date dateMin, Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByService(Date dateMin, Date dateMax);

    Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByNatureClient(Date dateMin, Date dateMax);
}
