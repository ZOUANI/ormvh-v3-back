package ma.zs.generated.bean;

import javax.persistence.ManyToOne;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import ma.zs.generated.bean.CategorieModelLettreReponse;
import ma.zs.generated.bean.User;

@Entity
public class ModelLettreReponse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss.SSS")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	private String libelleArab;
	private String code;
	private String type;
	private String chemin;
	private String libelle;
	private byte[] data;
	private String url;
	//@ManyToOne
	//private LettreModel lettreModel;
	@ManyToOne
	private CategorieModelLettreReponse categorieModelLettreReponse;
	@ManyToOne
	private User createdBy;
	@ManyToOne
	private User updatedBy;

	public ModelLettreReponse() {
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



	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}


	public String getChemin() {
		return chemin;
	}

	public CategorieModelLettreReponse getCategorieModelLettreReponse() {
		return this.categorieModelLettreReponse;
	}

	public void setCategorieModelLettreReponse(CategorieModelLettreReponse categorieModelLettreReponse) {
		this.categorieModelLettreReponse = categorieModelLettreReponse;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ModelLettreReponse(Long id, Date createdAt, Date updatedAt, String libelleArab, String code, String type,
			String chemin, String libelle, byte[] data, String url,
			CategorieModelLettreReponse categorieModelLettreReponse, User createdBy, User updatedBy) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.libelleArab = libelleArab;
		this.code = code;
		this.type = type;
		this.chemin = chemin;
		this.libelle = libelle;
		this.data = data;
		this.url = url;
		this.categorieModelLettreReponse = categorieModelLettreReponse;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "ModelLettreReponse [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", libelleArab=" + libelleArab + ", code=" + code + ", type=" + type + ", chemin=" + chemin
				+ ", libelle=" + libelle + ", data=" + Arrays.toString(data) + ", url=" + url
				+ ", categorieModelLettreReponse=" + categorieModelLettreReponse + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}

}
