package ma.zs.generated.service.impl;

import ma.zs.generated.bean.TrancheAge;
import ma.zs.generated.service.constant.EvaluationConstant;
import ma.zs.generated.service.constant.StatusConstant;
import ma.zs.generated.service.facade.StatistiqueService;
import ma.zs.generated.service.facade.TrancheAgeService;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StatistiqueServiceImpl extends  AbstractService<StatistiqueVo> implements StatistiqueService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    TrancheAgeService trancheAgeService;
    

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByNatureClient(Date dateMin,Date dateMax){
        return execQuery( "c.natureClient.libelle", false,dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex(Date dateMin,Date dateMax){
        return execQuery("c.expeditor.sexe.libelle", false,dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex(Date dateMin,Date dateMax){
        return execQuery("c.destinator.sexe.libelle", false,dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorTrancheAge(Date dateMin,Date dateMax){

        List<TrancheAge> tranches = trancheAgeService.findAll();
        Map<String,List<StatistiqueVo>> results = new HashMap<String, List<StatistiqueVo>>() {
        };
        tranches.forEach( tr -> execQuery("",false,addConstraintMinMax("c","destinator.age",tr.getAgeMin(),tr.getAgeMax()),dateMin,dateMax).forEach( (k,v) -> results.merge(k,v,(v1, v2) -> Stream.concat(v1.stream(), v1.stream())
                .collect(Collectors.toList()))));
        return results;
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorTrancheAge(Date dateMin,Date dateMax){
        List<TrancheAge> tranches = trancheAgeService.findAll();
        Map<String,List<StatistiqueVo>> results = new HashMap<String, List<StatistiqueVo>>() {
        };
        tranches.forEach( tr -> execQuery("",false,addConstraintMinMax("c","expeditor.age",tr.getAgeMin(),tr.getAgeMax()),dateMin,dateMax).forEach( (k,v) -> results.merge(k,v,(v1, v2) -> Stream.concat(v1.stream(), v2.stream())
                .collect(Collectors.toList()))));
        return results;
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierBySubject(Date dateMin,Date dateMax){
        return execQuery("c.subject",false,dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByVoie(Date dateMin,Date dateMax){
        return execQuery("c.voie.libelle",false,dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur(Date dateMin,Date dateMax){
        return execQuery("c.emetteur.code",false,dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByServiceCoord(Date dateMin,Date dateMax){
        return execQuery("c.coordinator.code",false,dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByService(Date dateMin,Date dateMax){
        return execQuery("csi.service.title","csi.service.title",true,"and csi.courrier.id=c.id",dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByEtatEval(Date dateMin,Date dateMax){
        Map<String, List<StatistiqueVo>> accepted =  execQuery("","",false, "and c.evaluation.code='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
        Map<String, List<StatistiqueVo>> refused =  execQuery("","",false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
        for (List<StatistiqueVo> res: accepted.values()) {
            for (StatistiqueVo stat: res) {
                stat.setGroupe("accepted");
            }
        }
        for (List<StatistiqueVo> res: refused.values()) {
            for (StatistiqueVo stat: res) {
                stat.setGroupe("refused");
            }
        }
        for (String key:  accepted.keySet()) {
            accepted.get(key).addAll(refused.get(key));
        }
        return accepted;
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject(Date dateMin,Date dateMax){
        return execQuery("c.subject","c.subject",false, "and c.evaluation.code='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject(Date dateMin,Date dateMax){
        return execQuery("c.subject","c.subject",false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax) ;
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient(Date dateMin,Date dateMax){
        return execQuery("c.natureClient.libelle", "c.natureClient.libelle", false,"and c.evaluation.code='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient(Date dateMin,Date dateMax){
        return execQuery("c.natureClient.libelle", "c.natureClient.libelle", false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByReason(Date dateMin,Date dateMax){
        return execQuery("c.evaluation.title", "c.evaluation.title", false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur(Date dateMin,Date dateMax){
        return execQuery("c.emetteur.code","c.emetteur.code",false,"and c.status.code='"+ StatusConstant.TRAITE +"'",dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord(Date dateMin,Date dateMax){
        return execQuery("c.coordinator.code","c.coordinator.code",false,"and c.status.code='"+ StatusConstant.TRAITE +"'",dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByService(Date dateMin,Date dateMax){
        return execQuery("csi.service.title","csi.service.title",true,"and c.status.code='"+ StatusConstant.TRAITE +"' and csi.courrier.id=c.id ",dateMin,dateMax);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient(Date dateMin,Date dateMax){
        return execQuery("c.natureClient.libelle", "c.natureClient.libelle", false,"and c.status.code='"+ StatusConstant.TRAITE +"'",dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByService(Date dateMin,Date dateMax){
        return execQuery("csi.service.title",true,"and c.status.code!='"+ StatusConstant.TRAITE +"' and csi.courrier.id=c.id and c.delaiReponse < 15",dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeReponduByNatureClient(Date dateMin,Date dateMax){
        return execQuery("c.natureClient.libelle",true," and c.delaiReponse < 15 and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByService(Date dateMin,Date dateMax){
        return execQuery("csi.service.title",true,"and csi.courrier.id=c.id and c.delaiReponse > 15 and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRejeteNonConformeSansReponceByNatureClient(Date dateMin,Date dateMax){
        return execQuery("c.natureClient.libelle",true," and c.delaiReponse > 15 and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'",dateMin,dateMax);

    }

  //-----------------------------------------------------------------------------------------
    @Override
    public StatistiqueVo save(StatistiqueVo statistiqueVo) {
        return null;
    }


    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupBy, boolean service){
        return execQuery(criteriaGroupBy,criteriaGroupBy,service,"");
    }
    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupBy, boolean service,String additionalCriterias){
        return execQuery(criteriaGroupBy,criteriaGroupBy,service,additionalCriterias);
    }
    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupBy, boolean service,Date dateMin,Date dateMax){
        if(dateMin!=null && dateMax!=null)  return execQuery(criteriaGroupBy,criteriaGroupBy,service,"",dateMin,dateMax);
         return execQuery(criteriaGroupBy,criteriaGroupBy,service,"");
    }
    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupBy, boolean service,String additionalCriterias,Date dateMin,Date dateMax){
        if(dateMin!=null && dateMax!=null)  return execQuery(criteriaGroupBy,criteriaGroupBy,service,additionalCriterias,dateMin,dateMax);
        return execQuery(criteriaGroupBy,criteriaGroupBy,service,additionalCriterias);
    }

    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupByInQuey, String criteriaGroupBy, boolean service){
        return execQuery(criteriaGroupByInQuey,criteriaGroupBy,service,"");
    }
    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupByInQuey, String criteriaGroupBy, boolean service, String additionalCriterias, Date dateMin, Date dateMax){

        String add = additionalCriterias;
        if(dateMin!=null && dateMax!=null)  add+=addConstraintMinMaxDate("c","sentAt",dateMin,dateMax);
        return execQuery(criteriaGroupByInQuey,criteriaGroupBy,service,add);
    }
    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupByInQuey,String criteriaGroupBy,boolean service,String additionalCriterias){
        List<String> list = Arrays.asList("oservations", "propositions", "reclamations");
        List<String> queries= new ArrayList<>();
        List<StatistiqueVo> resQuery;
        Map<String, List<StatistiqueVo>> resultat= new HashMap<>();
        for (String s : list) {
            queries.add(constructQuery(s,criteriaGroupByInQuey,criteriaGroupBy,service,additionalCriterias));
        }
        System.out.println("queries = " + queries);
        for (String query : queries) {
            resQuery=new ArrayList<>();
            for(Object res : entityManager.createQuery(query).getResultList()){
                resQuery.add((StatistiqueVo) res);
            }
            resultat.put(list.get(queries.indexOf(query)),resQuery);
        }
        System.out.println("resultat = " + resultat);
        return resultat;
    }


    private String constructQuery(String typeRequetteCode,String criteriaGroupByInQuey,String criteriaGroupBy ,boolean service,String additionnalConditions){
        String query= "Select NEW ma.zs.generated.ws.rest.provided.vo.StatistiqueVo(COUNT(c.id)";
        if(StringUtil.isNotEmpty(criteriaGroupByInQuey)) query+=", "+criteriaGroupByInQuey;
        query+=") FROM Courrier c";
        if(service){
            query += " , CourrierServiceItem csi"  ;
        }
        query+=" WHERE c.typeRequette.code ='"+typeRequetteCode+"' " + additionnalConditions;
        if(StringUtil.isNotEmpty(criteriaGroupBy))query+=" GROUP BY "+criteriaGroupBy;
        return query;
    }
}
