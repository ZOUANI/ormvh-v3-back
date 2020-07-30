package  ma.zs.generated.ws.rest.provided.facade;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.zs.generated.bean.LettreModel;
import ma.zs.generated.bean.ModelLettreReponse;
import ma.zs.generated.service.facade.ModelLettreReponseService;
import ma.zs.generated.ws.rest.provided.converter.ModelLettreReponseConverter;
import ma.zs.generated.ws.rest.provided.vo.ModelLettreReponseVo;

@Api("Manages modelLettreReponse services")
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("generated/modelLettreReponse")
public class ModelLettreReponseRest {

	@Autowired 
	private ModelLettreReponseService modelLettreReponseService;
	
	@Autowired 
	private ModelLettreReponseConverter modelLettreReponseConverter ;

    @ApiOperation("creates the specified modelLettreReponse")
	@PostMapping("/")
	public ModelLettreReponseVo create(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
		ModelLettreReponse modelLettreReponse= modelLettreReponseConverter.toItem(modelLettreReponseVo);
	  modelLettreReponse=	modelLettreReponseService.create(modelLettreReponse);
		return modelLettreReponseConverter.toVo(modelLettreReponse);
	}

    @ApiOperation("Delete the specified modelLettreReponse")
	@DeleteMapping("/")
	public int delete(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
		ModelLettreReponse modelLettreReponse = modelLettreReponseConverter.toItem(modelLettreReponseVo);
		return modelLettreReponseService.delete(modelLettreReponse);
	}

	@ApiOperation("Updates the specified modelLettreReponse")
	@PostMapping("/edit")
	public ModelLettreReponseVo update(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
		System.out.println("hello");
		ModelLettreReponse modelLettreReponse= modelLettreReponseConverter.toItem(modelLettreReponseVo);
	  modelLettreReponse=	modelLettreReponseService.update(modelLettreReponse);
		return modelLettreReponseConverter.toVo(modelLettreReponse);
	}

	@ApiOperation("Finds a list of all modelLettreReponses")
	@GetMapping("/")
	public List<ModelLettreReponseVo> findAll(){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findAll());
	}
    
	@ApiOperation("Finds a modelLettreReponse by id")
	@GetMapping("/id/{id}")
	public ModelLettreReponseVo findById(@PathVariable Long id){
		return  modelLettreReponseConverter.toVo(modelLettreReponseService.findById(id));
	}
	@ApiOperation("Deletes a modelLettreReponse by id")
	@DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id){
		 modelLettreReponseService.deleteById(id);
	}

	@ApiOperation("Finds a  modelLettreReponse by libelle")
    @GetMapping("/libelle/{libelle}")
	public ModelLettreReponseVo findByLibelle(@PathVariable String libelle){
		return  modelLettreReponseConverter.toVo(modelLettreReponseService.findByLibelle(libelle));
	}
	@ApiOperation("Deletes a  modelLettreReponse by libelle")
    @DeleteMapping("/libelle/{libelle}")
	public int deleteByLibelle(@PathVariable String libelle){
		return  modelLettreReponseService.deleteByLibelle(libelle);
	}
	


    @ApiOperation("Finds a modelLettreReponse by libelle of categorieModelLettreReponse")
	@GetMapping("/categorieModelLettreReponse/libelle/{libelle}")
	public List<ModelLettreReponseVo> findByCategorieModelLettreReponseLibelle(@PathVariable String libelle){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCategorieModelLettreReponseLibelle(libelle));
	}
	
	@ApiOperation("Deletes a modelLettreReponse by libelle of categorieModelLettreReponse")
	@DeleteMapping("/categorieModelLettreReponse/libelle/{libelle}")
	public int deleteByCategorieModelLettreReponseLibelle(@PathVariable String libelle){
		return modelLettreReponseService.deleteByCategorieModelLettreReponseLibelle(libelle);
	}
	
	@ApiOperation("Finds modelLettreReponse by id of categorieModelLettreReponse")
	@GetMapping("/categorieModelLettreReponse/id/{id}")
	public List<ModelLettreReponseVo> findByCategorieModelLettreReponseId(@PathVariable Long id){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCategorieModelLettreReponseId(id));
	}
	@ApiOperation("Deletes modelLettreReponse by id of categorieModelLettreReponse")
	@DeleteMapping("/categorieModelLettreReponse/id/{id}")
	public int deleteByCategorieModelLettreReponseId(@PathVariable Long id){
		return modelLettreReponseService.deleteByCategorieModelLettreReponseId(id);
	}
     	
    @ApiOperation("Finds a modelLettreReponse by username of createdBy")
	@GetMapping("/createdBy/username/{username}")
	public List<ModelLettreReponseVo> findByCreatedByUsername(@PathVariable String username){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCreatedByUsername(username));
	}
	
	@ApiOperation("Deletes a modelLettreReponse by username of createdBy")
	@DeleteMapping("/createdBy/username/{username}")
	public int deleteByCreatedByUsername(@PathVariable String username){
		return modelLettreReponseService.deleteByCreatedByUsername(username);
	}
	
	@ApiOperation("Finds modelLettreReponse by id of createdBy")
	@GetMapping("/createdBy/id/{id}")
	public List<ModelLettreReponseVo> findByCreatedById(@PathVariable Long id){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCreatedById(id));
	}
	@ApiOperation("Deletes modelLettreReponse by id of createdBy")
	@DeleteMapping("/createdBy/id/{id}")
	public int deleteByCreatedById(@PathVariable Long id){
		return modelLettreReponseService.deleteByCreatedById(id);
	}
     	
    @ApiOperation("Finds a modelLettreReponse by username of updatedBy")
	@GetMapping("/updatedBy/username/{username}")
	public List<ModelLettreReponseVo> findByUpdatedByUsername(@PathVariable String username){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByUpdatedByUsername(username));
	}
	
	@ApiOperation("Deletes a modelLettreReponse by username of updatedBy")
	@DeleteMapping("/updatedBy/username/{username}")
	public int deleteByUpdatedByUsername(@PathVariable String username){
		return modelLettreReponseService.deleteByUpdatedByUsername(username);
	}
	
	@ApiOperation("Finds modelLettreReponse by id of updatedBy")
	@GetMapping("/updatedBy/id/{id}")
	public List<ModelLettreReponseVo> findByUpdatedById(@PathVariable Long id){
		return modelLettreReponseConverter.toVo(modelLettreReponseService.findByUpdatedById(id));
	}
	@ApiOperation("Deletes modelLettreReponse by id of updatedBy")
	@DeleteMapping("/updatedBy/id/{id}")
	public int deleteByUpdatedById(@PathVariable Long id){
		return modelLettreReponseService.deleteByUpdatedById(id);
	}
     	
   
    @ApiOperation("Search modelLettreReponse by a specific criterion")
    @PostMapping("/search")
	public List<ModelLettreReponseVo> findByCriteria(@RequestBody ModelLettreReponseVo modelLettreReponseVo){
       return modelLettreReponseConverter.toVo(modelLettreReponseService.findByCriteria(modelLettreReponseVo));
	}	
	public ModelLettreReponseConverter getModelLettreReponseConverter(){
		return modelLettreReponseConverter;
	}
 
	public void setModelLettreReponseConverter(ModelLettreReponseConverter modelLettreReponseConverter){
		this.modelLettreReponseConverter=modelLettreReponseConverter;
	}

	public ModelLettreReponseService getModelLettreReponseService(){
		return modelLettreReponseService;
	}
	public void setModelLettreReponseService( ModelLettreReponseService modelLettreReponseService){
	 	this.modelLettreReponseService=modelLettreReponseService;
	}
	
	 @PostMapping("/uploadFile")
	    public int uploadFile(@RequestParam("file") MultipartFile file) {
	       return modelLettreReponseService.storeFile(file);
	    }
	   @GetMapping("/downloadFile/{fileName}")
	    public LettreModel downloadFile(@PathVariable String fileName,HttpServletResponse response) throws IOException {
	        // Load file as Resource
	        LettreModel databaseFile = modelLettreReponseService.getFile(fileName);
	        if(databaseFile != null) {
	        	if(databaseFile.getFileType().equals("application/pdf")) {
	        		response.setContentType("application/pdf");
	        		fileName += ".pdf";
	        	} else {
	        		response.setContentType("application/msword");
	        		fileName += ".docx";
	        	}
	        		String fileLocation = "C:/Users/hp/Desktop/PROJET ZOUANI/ormvh-v3-back/";
	                File convFile = new File(databaseFile.getFileName());
	                convFile.createNewFile();
	                System.out.println("ana hna tani");
	                FileOutputStream fos = new FileOutputStream(fileLocation+ convFile);
	                fos.write(databaseFile.getData());
	                fos.close();
	               /* fileName = convFile.getName();
	                System.out.println(fileName);
	                 response.setHeader("Content-Disposition", "attachment; filename=" +fileName);
	   	  	     response.setHeader("Content-Transfer-Encoding", "binary");
	   	  	      try {
	   	  	    	  BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
	   	  	    	  FileInputStream fis = new FileInputStream(fileLocation + fileName);
	   	  	    	  int len;
	   	  	    	  byte[] buf = new byte[1024];
	   	  	    	  while((len = fis.read(buf)) > 0) {
	   	  	    		  bos.write(buf,0,len);
	   	  	    	  }
	   	  	    	  bos.close();
	   	  	    	  response.flushBuffer();
	   	  	    System.out.println("ana hna");
	   	  	      }
	   	  	      catch(IOException e) {
	   	  	    	  e.printStackTrace();
	   	  	    	  
	   	  	      }*/
	        }
	                return databaseFile;    
	 	   }
/*	        	if (fileName.indexOf(".doc")>-1) response.setContentType("application/msword");
	  	      if (fileName.indexOf(".docx")>-1) response.setContentType("application/msword");
	  	      if (fileName.indexOf(".xls")>-1) response.setContentType("application/vnd.ms-excel");
	  	      if (fileName.indexOf(".csv")>-1) response.setContentType("application/vnd.ms-excel");
	  	      if (fileName.indexOf(".ppt")>-1) response.setContentType("application/ppt");
	  	      if (fileName.indexOf(".pdf")>-1) response.setContentType("application/pdf");
	  	      if (fileName.indexOf(".zip")>-1) response.setContentType("application/zip");*/
	             //   response.setContentType(databaseFile.getFileType());
	  	     // response.setHeader("Content-Disposition", "attachment; filename=" +fileName);
	  	     //response.setHeader("Content-Transfer-Encoding", "binary");
	  	      /*try {
	  	    	  BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
	  	    	  FileInputStream fis = new FileInputStream(fileLocation + fileName);
	  	    	  int len;
	  	    	  byte[] buf = new byte[1024];
	  	    	  while((len = fis.read(buf)) > 0) {
	  	    		  bos.write(buf,0,len);
	  	    	  }
	  	    	  bos.close();
	  	    	  response.flushBuffer();
	  	    System.out.println("ana hna");
	  	      }
	  	      catch(IOException e) {
	  	    	  e.printStackTrace();
	  	    	  
	  	      }*/
	             /*   HttpHeaders headers = new HttpHeaders();
	                headers.setContentType(MediaType.parseMediaType(databaseFile.getFileType()));
	                String filename = databaseFile.getFileName();
	                headers.add("content-disposition", "inline;filename=" + filename);
	                headers.setContentDispositionFormData(databaseFile.getFileName(), databaseFile.getFileName());
	                headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
	                response = new ResponseEntity<byte[]>(databaseFile.getData(), headers, HttpStatus.OK);*/
	        //}
	  //      System.out.println(response);
//     ByteArrayInputStream bais = new ByteArrayInputStream(databaseFile.getData());
	       /* LettreModel databaseFile1 = new LettreModel(databaseFile.getFileName(), databaseFile.getFileType(),
	                decompressBytes(databaseFile.getData()));*/
	  	
	   @GetMapping("/getFile/{fileName}")
	    public LettreModel compressFile(@PathVariable String fileName) throws IOException {
	        // Load file as Resource
	        LettreModel databaseFile = modelLettreReponseService.getFile(fileName);
	     return  databaseFile; 
	   }
	   
	   // uncompress the image bytes before returning it to the angular application
	   public static byte[] decompressBytes(byte[] data) {
	       Inflater inflater = new Inflater();
	       inflater.setInput(data);
	       ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
	       byte[] buffer = new byte[1024];
	       try {
	           while (!inflater.finished()) {
	               int count = inflater.inflate(buffer);
	               outputStream.write(buffer, 0, count);
	           }
	           outputStream.close();
	       } catch (IOException ioe) {
	       } catch (DataFormatException e) {
	       }
	       return outputStream.toByteArray();
	   }
}