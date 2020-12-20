package ma.zs.generated.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TrancheDelaiReponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer delaiResponseMin;
    private Integer delaiResponseMax;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDelaiResponseMin() {
        return delaiResponseMin;
    }

    public void setDelaiResponseMin(Integer delaiResponseMin) {
        this.delaiResponseMin = delaiResponseMin;
    }

    public Integer getDelaiResponseMax() {
        return delaiResponseMax;
    }

    public void setDelaiResponseMax(Integer delaiResponseMax) {
        this.delaiResponseMax = delaiResponseMax;
    }

    @Override
    public String toString() {
        return "TrancheDelaiReponse{" +
                "id=" + id +
                ", delaiResponseMin=" + delaiResponseMin +
                ", delaiResponseMax=" + delaiResponseMax +
                '}';
    }
}
