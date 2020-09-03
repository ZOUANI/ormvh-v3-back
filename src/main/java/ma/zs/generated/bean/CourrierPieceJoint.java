package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.List;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import ma.zs.generated.bean.CourrierObject;
import ma.zs.generated.bean.Voie;
import ma.zs.generated.bean.NatureCourrier;
import ma.zs.generated.bean.Courrier;
import ma.zs.generated.bean.Expeditor;
import ma.zs.generated.bean.LeService;
import ma.zs.generated.bean.Evaluation;
import ma.zs.generated.bean.ExpeditorType;
import ma.zs.generated.bean.Subdivision;
import ma.zs.generated.bean.Status;
import ma.zs.generated.bean.TypeCourrier;
import ma.zs.generated.bean.User;

@Entity
public class CourrierPieceJoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String chemin;
    private byte[] contenu;
    private String type;
    @ManyToOne
    private Courrier courier;
    
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getContenu() {
		return contenu;
	}
	public void setContenu(byte[] contenu) {
		this.contenu = contenu;
	}
	public Courrier getCourier() {
		return courier;
	}
	public void setCourier(Courrier courier) {
		this.courier = courier;
	}
	public CourrierPieceJoint() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CourrierPieceJoint(Long id, String chemin, byte[] contenu, String type, Courrier courier) {
		super();
		this.id = id;
		this.chemin = chemin;
		this.contenu = contenu;
		this.type = type;
		this.courier = courier;
	}
	@Override
	public String toString() {
		return "CourrierPieceJoint [id=" + id + ", chemin=" + chemin + ", contenu=" + Arrays.toString(contenu)
				+ ", type=" + type + ", courier=" + courier + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chemin == null) ? 0 : chemin.hashCode());
		result = prime * result + Arrays.hashCode(contenu);
		result = prime * result + ((courier == null) ? 0 : courier.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourrierPieceJoint other = (CourrierPieceJoint) obj;
		if (chemin == null) {
			if (other.chemin != null)
				return false;
		} else if (!chemin.equals(other.chemin))
			return false;
		if (!Arrays.equals(contenu, other.contenu))
			return false;
		if (courier == null) {
			if (other.courier != null)
				return false;
		} else if (!courier.equals(other.courier))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}

