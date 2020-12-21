package ma.zs.generated.service.impl;

import ma.zs.generated.service.constant.EvaluationConstant;
import ma.zs.generated.service.constant.StatusConstant;
import ma.zs.generated.service.facade.StatistiqueService;
import ma.zs.generated.service.util.StringUtil;
import ma.zs.generated.ws.rest.provided.vo.StatistiqueVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.*;

@Service
public class StatistiqueServiceImpl extends  AbstractService<StatistiqueVo> implements StatistiqueService {

    @Autowired
    EntityManager entityManager;
    

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByNatureClient(){
        return execQuery( "c.natureClient.libelle", false);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByExpeditorSex(){
        return execQuery("c.expeditor.sex.libelle", false);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByDestinatorSex(){
        return execQuery("c.destinator.sex.libelle", false);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierBySubject(){
        return execQuery("c.subject",false);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByVoie(){
        return execQuery("c.voie.libelle",false);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByServiceEmeteur(){
        return execQuery("c.emetteur.code",false);
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByServiceCoord(){
        return execQuery("c.coordinator.code",false);
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByService(){
        return execQuery("csi.service.title","csi.service.title",true,"and csi.courrier.id=c.id");
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierByEtatEval(){
        Map<String, List<StatistiqueVo>> accepted =  execQuery("","",false, "and c.evaluation.code='"+ EvaluationConstant.CONFORME+"'");
        Map<String, List<StatistiqueVo>> refused =  execQuery("","",false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'");
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
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedBySubject(){
        return execQuery("c.subject","c.subject",false, "and c.evaluation.code='"+ EvaluationConstant.CONFORME+"'");
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRefusedBySubject(){
        return execQuery("c.subject","c.subject",false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'") ;
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierAcceptedByNatureClient(){
        return execQuery("c.natureClient.libelle", "c.natureClient.libelle", false,"and c.evaluation.code='"+ EvaluationConstant.CONFORME+"'");
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByNatureClient(){
        return execQuery("c.natureClient.libelle", "c.natureClient.libelle", false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'");
    }
    @Override
    public Map<String, List<StatistiqueVo>> countCourrierRefusedByReason(){
        return execQuery("c.evaluation.title", "c.evaluation.title", false,"and c.evaluation.code is not null and c.evaluation.code!='"+ EvaluationConstant.CONFORME+"'");
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceEmeteur(){
        return execQuery("c.emetteur.code","c.emetteur.code",false,"and c.status.code='"+ StatusConstant.TRAITE +"'");
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByServiceCoord(){
        return execQuery("c.coordinator.code","c.coordinator.code",false,"and c.status.code='"+ StatusConstant.TRAITE +"'");
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByService(){
        return execQuery("csi.service.title","csi.service.title",true,"and c.status.code='"+ StatusConstant.TRAITE +"' and csi.courrier.id=c.id ");
    }

    @Override
    public Map<String, List<StatistiqueVo>> countCourrierTraiteByNatureClient(){
        return execQuery("c.natureClient.libelle", "c.natureClient.libelle", false,"and c.status.code='"+ StatusConstant.TRAITE +"'");
    }

    @Override
    public StatistiqueVo save(StatistiqueVo statistiqueVo) {
        return null;
    }


    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupBy, boolean service){
        return execQuery(criteriaGroupBy,criteriaGroupBy,service,"");
    }

    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupByInQuey, String criteriaGroupBy, boolean service){
        return execQuery(criteriaGroupByInQuey,criteriaGroupBy,service,"");
    }
    private Map<String, List<StatistiqueVo>> execQuery(String criteriaGroupByInQuey, String criteriaGroupBy, boolean service, String additionalCriterias, Date dateMin, Date dateMax){

        String add = additionalCriterias;
        add+=addConstraintMinMaxDate("c","sentAt",dateMin,dateMax);
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
