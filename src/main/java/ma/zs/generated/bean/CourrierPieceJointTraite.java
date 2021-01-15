package ma.zs.generated.bean;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class CourrierPieceJointTraite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String chemin;
    private String absoluteChemin = "C:\\Users\\" + System.getProperty("user.name") + "\\pieces-jointes-traite\\" + chemin;
	private byte[] contenu;
    private String type;
    @ManyToOne
    private Courrier courier;

	public String getAbsoluteChemin() {
		return absoluteChemin;
	}

	public void setAbsoluteChemin(String absoluteChemin) {
		this.absoluteChemin = absoluteChemin;
	}

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
	public CourrierPieceJointTraite() {
		super();
		// TODO Auto-generated constructor stub
		this.absoluteChemin = "C:\\Users\\" + System.getProperty("user.name") + "\\pieces-jointes-traite\\" + chemin;
	}


	public CourrierPieceJointTraite(Long id, String chemin, byte[] contenu, String type, Courrier courier) {
		super();
		this.id = id;
		this.chemin = chemin;
		this.contenu = contenu;
		this.type = type;
		this.courier = courier;
		this.absoluteChemin = "C:\\Users\\" + System.getProperty("user.name") + "\\pieces-jointes-traite\\" + chemin;
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
		CourrierPieceJointTraite other = (CourrierPieceJointTraite) obj;
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

