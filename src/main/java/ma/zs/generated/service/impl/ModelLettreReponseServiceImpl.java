package ma.zs.generated.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import ma.zs.generated.bean.CategorieModelLettreReponse;
import ma.zs.generated.bean.ModelLettreReponse;
import ma.zs.generated.dao.ModelLettreReponseDao;
import ma.zs.generated.exception.FileStorageException;
import ma.zs.generated.service.facade.CategorieModelLettreReponseService;
import ma.zs.generated.service.facade.ModelLettreReponseService;
import ma.zs.generated.service.facade.UserService;
import ma.zs.generated.ws.rest.provided.vo.ModelLettreReponseVo;

@Service
public class ModelLettreReponseServiceImpl extends AbstractService<ModelLettreReponse>implements ModelLettreReponseService {
	  private final Path root = Paths.get("uploads");

	@Autowired
	private ModelLettreReponseDao modelLettreReponseDao;
	@Autowired
	private UserService userService;
	@Autowired
	private CategorieModelLettreReponseService categorieModelLettreReponseService;

	@Autowired
	private EntityManager entityManager;
	private byte[] data;
	private String url;
private String type;

public void init() {
  try {
    Files.createDirectory(root);
  } catch (IOException e) {
    throw new RuntimeException("Could not initialize folder for upload!");
  }
}


public Resource load(String filename) {
    try {
      Path file = root.resolve(filename);
      Resource resource = new UrlResource(file.toUri());

      if (resource.exists() || resource.isReadable()) {
        return resource;
      } else {
        throw new RuntimeException("Could not read the file!");
      }
    } catch (MalformedURLException e) {
      throw new RuntimeException("Error: " + e.getMessage());
    }
  }

public void deleteAll() {
    FileSystemUtils.deleteRecursively(root.toFile());
  }
public Stream<Path> loadAll() {
    try {
      return Files.walk(this.root, 1).filter(path -> !path.equals(this.root)).map(this.root::relativize);
    } catch (IOException e) {
      throw new RuntimeException("Could not load the files!");
    }
  }
	@Override
	public List<ModelLettreReponse> findAll() {
		return modelLettreReponseDao.findAll();
	}

	@Override
	public List<ModelLettreReponse> findByCategorieModelLettreReponseLibelle(String libelle) {
		return modelLettreReponseDao.findByCategorieModelLettreReponseLibelle(libelle);
	}

	@Override
	@Transactional
	public int deleteByCategorieModelLettreReponseLibelle(String libelle) {
		return modelLettreReponseDao.deleteByCategorieModelLettreReponseLibelle(libelle);
	}

	@Override
	public List<ModelLettreReponse> findByCategorieModelLettreReponseId(Long id) {
		return modelLettreReponseDao.findByCategorieModelLettreReponseId(id);

	}

	@Override
	@Transactional
	public int deleteByCategorieModelLettreReponseId(Long id) {
		return modelLettreReponseDao.deleteByCategorieModelLettreReponseId(id);

	}

	@Override
	public List<ModelLettreReponse> findByCreatedByUsername(String username) {
		return modelLettreReponseDao.findByCreatedByUsername(username);
	}

	@Override
	@Transactional
	public int deleteByCreatedByUsername(String username) {
		return modelLettreReponseDao.deleteByCreatedByUsername(username);
	}

	@Override
	public List<ModelLettreReponse> findByCreatedById(Long id) {
		return modelLettreReponseDao.findByCreatedById(id);

	}

	@Override
	@Transactional
	public int deleteByCreatedById(Long id) {
		return modelLettreReponseDao.deleteByCreatedById(id);

	}

	@Override
	public List<ModelLettreReponse> findByUpdatedByUsername(String username) {
		return modelLettreReponseDao.findByUpdatedByUsername(username);
	}

	@Override
	@Transactional
	public int deleteByUpdatedByUsername(String username) {
		return modelLettreReponseDao.deleteByUpdatedByUsername(username);
	}

	@Override
	public List<ModelLettreReponse> findByUpdatedById(Long id) {
		return modelLettreReponseDao.findByUpdatedById(id);

	}

	@Override
	@Transactional
	public int deleteByUpdatedById(Long id) {
		return modelLettreReponseDao.deleteByUpdatedById(id);

	}

	@Override
	public ModelLettreReponse findByLibelle(String libelle) {
		if (libelle == null)
			return null;
		return modelLettreReponseDao.findByLibelle(libelle);
	}

	@Override
	@Transactional
	public int deleteByLibelle(String libelle) {
		return modelLettreReponseDao.deleteByLibelle(libelle);
	}

	@Override
	public ModelLettreReponse findById(Long id) {
		if (id == null)
			return null;
		return modelLettreReponseDao.getOne(id);
	}

	@Transactional
	public void deleteById(Long id) {
		modelLettreReponseDao.deleteById(id);
	}

	public int storeFile(MultipartFile file) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}
			this.data = file.getBytes();
			this.type = file.getContentType();
						//  try {
			  //    Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
			    //} catch (Exception e) {
			      //throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
			    //}
//			LettreModel dbFile = new LettreModel(fileName, file.getContentType(), file.getBytes());
	//		modelLettreDao.save(dbFile);
			return 1;
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	@Override
	public ModelLettreReponse save(ModelLettreReponse modelLettreReponse) {
		ModelLettreReponse foundedModelLettreReponse = findByLibelle(modelLettreReponse.getLibelle());
		if (foundedModelLettreReponse != null)
			return null;

		if (modelLettreReponse.getCategorieModelLettreReponse() != null) {
			CategorieModelLettreReponse categorieModelLettreReponse = categorieModelLettreReponseService
					.findByLibelle(modelLettreReponse.getCategorieModelLettreReponse().getLibelle());
			modelLettreReponse.setCategorieModelLettreReponse(categorieModelLettreReponse);
		}
//		LettreModel lettreModel = modelLettreDao.findByFileName(modelLettreReponse.getChemin());
		//modelLettreReponse.setLettreModel(lettreModel);
		modelLettreReponse.setType(this.type);
		modelLettreReponse.setData(this.data);
		ModelLettreReponse savedModelLettreReponse = modelLettreReponseDao.save(modelLettreReponse);
		return savedModelLettreReponse;
	}

	@Override
	public ModelLettreReponse update(ModelLettreReponse modelLettreReponse) {
		ModelLettreReponse foundedModelLettreReponse = findById(modelLettreReponse.getId());
		if(modelLettreReponse.getChemin() == null) {
			modelLettreReponse.setChemin(foundedModelLettreReponse.getChemin());
		}
		if (foundedModelLettreReponse == null)
			return null;

		if (modelLettreReponse.getCategorieModelLettreReponse() != null) {
			CategorieModelLettreReponse categorieModelLettreReponse = categorieModelLettreReponseService
					.findByLibelle(modelLettreReponse.getCategorieModelLettreReponse().getLibelle());
			modelLettreReponse.setCategorieModelLettreReponse(categorieModelLettreReponse);
		}
		//LettreModel lettreModel = modelLettreDao.findByFileName(modelLettreReponse.getChemin());
//		modelLettreReponse.setLettreModel(lettreModel);
		if(this.data != null) {
			modelLettreReponse.setData(this.data);
			modelLettreReponse.setType(this.type);
		}
//		String url = MvcUriComponentsBuilder.fromMethodName(ModelLettreReponseRest.class, "getFile",""+ modelLettreReponse.getChemin() ;
	//	modelLettreReponse.setUrl(url);
		ModelLettreReponse savedModelLettreReponse = modelLettreReponseDao.save(modelLettreReponse);
		prepareUpdate(foundedModelLettreReponse);
		return savedModelLettreReponse;

	}

	@Override
	@Transactional
	public int delete(ModelLettreReponse modelLettreReponse) {

		if (modelLettreReponse.getLibelle() == null)
			return -1;

		ModelLettreReponse foundedModelLettreReponse = findByLibelle(modelLettreReponse.getLibelle());
		if (foundedModelLettreReponse == null)
			return -1;
		modelLettreReponseDao.delete(foundedModelLettreReponse);
		return 1;
	}

	public List<ModelLettreReponse> findByCriteria(ModelLettreReponseVo modelLettreReponseVo) {
		String query = "SELECT o FROM ModelLettreReponse o where 1=1 ";
		query += addConstraintDate("o", "createdAt", "=", modelLettreReponseVo.getCreatedAt());
		query += addConstraintDate("o", "updatedAt", "=", modelLettreReponseVo.getUpdatedAt());
		query += addConstraint("o", "libelleArab", "LIKE", modelLettreReponseVo.getLibelleArab());

		query += addConstraint("o", "code", "LIKE", modelLettreReponseVo.getCode());

		query += addConstraint("o", "chemin", "LIKE", modelLettreReponseVo.getChemin());

		query += addConstraint("o", "id", "=", modelLettreReponseVo.getId());
		query += addConstraint("o", "libelle", "LIKE", modelLettreReponseVo.getLibelle());

		query += addConstraintMinMaxDate("o", "createdAt", modelLettreReponseVo.getCreatedAtMin(),
				modelLettreReponseVo.getCreatedAtMax());
		query += addConstraintMinMaxDate("o", "updatedAt", modelLettreReponseVo.getUpdatedAtMin(),
				modelLettreReponseVo.getUpdatedAtMax());
		if (modelLettreReponseVo.getCategorieModelLettreReponseVo() != null) {
			query += addConstraint("o", "categorieModelLettreReponse.id", "=",
					modelLettreReponseVo.getCategorieModelLettreReponseVo().getId());
			query += addConstraint("o", "categorieModelLettreReponse.libelle", "LIKE",
					modelLettreReponseVo.getCategorieModelLettreReponseVo().getLibelle());
		}

		if (modelLettreReponseVo.getCreatedByVo() != null) {
			query += addConstraint("o", "createdBy.id", "=", modelLettreReponseVo.getCreatedByVo().getId());
			query += addConstraint("o", "createdBy.username", "LIKE",
					modelLettreReponseVo.getCreatedByVo().getUsername());
		}

		if (modelLettreReponseVo.getUpdatedByVo() != null) {
			query += addConstraint("o", "updatedBy.id", "=", modelLettreReponseVo.getUpdatedByVo().getId());
			query += addConstraint("o", "updatedBy.username", "LIKE",
					modelLettreReponseVo.getUpdatedByVo().getUsername());
		}

		return entityManager.createQuery(query).getResultList();
	}
	

	@Override
	public ModelLettreReponse findByChemin(String chemin) {
		return modelLettreReponseDao.findByChemin(chemin);
	}
}
