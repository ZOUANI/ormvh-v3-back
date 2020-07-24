package ma.zs.generated.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TypeCourrier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String libelleArab;
    private String code;
    private String libelle;
    private String color;


    public TypeCourrier() {
        super();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelleArab() {
        return this.libelleArab;
    }

    public void setLibelleArab(String libelleArab) {
        this.libelleArab = libelleArab;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

     public void setColor(String color) {
          this.color = color;
     }
}

