package ma.zs.generated.ws.rest.provided.vo;

public class StatistiqueVo {
    private Long count;
    private String groupe;

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

    @Override
    public String toString() {
        return "StatistiqueVo{" +
                "count=" + count +
                ", groupe='" + groupe + '\'' +
                '}';
    }
}
