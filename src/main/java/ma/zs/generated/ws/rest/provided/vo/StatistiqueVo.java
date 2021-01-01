package ma.zs.generated.ws.rest.provided.vo;

public class StatistiqueVo {
    private Long count;
    private String groupe;
    private String dateMin;
    private String dateMax;
    private String trimestre;

    public StatistiqueVo() {
    }

    public StatistiqueVo(Long count, String groupe) {
        this.count = count;
        this.groupe = groupe;
    }

    public StatistiqueVo(Long count) {
        this.count = count;

    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getDateMin() {
        return dateMin;
    }

    public void setDateMin(String dateMin) {
        this.dateMin = dateMin;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public String getDateMax() {
        return dateMax;
    }

    public void setDateMax(String dateMax) {
        this.dateMax = dateMax;
    }

    @Override
    public String toString() {
        return "StatistiqueVo{" +
                "count=" + count +
                ", groupe='" + groupe + '\'' +
                '}';
    }
}
