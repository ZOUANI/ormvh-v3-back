package ma.zs.generated.service.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import static org.hibernate.internal.util.ConfigHelper.getResourceAsStream;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.jasperreports.JasperReportsUtils;

/**
 *
 * @author ismail
 */
public class GeneratePdf {

    public static ResponseEntity<Object> generate(String name, Map<String, Object> params, List data, String linkJasper) throws JRException, IOException {

        File pdfFile = File.createTempFile(name + "", ".pdf");
        FileOutputStream pos = new FileOutputStream(pdfFile);
        JasperReport report = (JasperReport) JRLoader.loadObject(getResourceAsStream(linkJasper));
        JRDataSource dataSource = new JRBeanCollectionDataSource(data);
        JasperReportsUtils.renderAsPdf(report, params, dataSource, pos);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(pdfFile));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", pdfFile.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(pdfFile.length()).contentType(MediaType.parseMediaType("application/pdf")).body(resource);
        return responseEntity;

    }

    public static ResponseEntity<Object> generatePdfs(String name, Map<String, Object> params, List data, String linkJasper) throws JRException, IOException {

        List<File> files = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            List<Object> objs = new ArrayList<>();
            objs.add(data.get(i));
            File pdfFile = File.createTempFile(name + i + "", ".pdf");
            FileOutputStream pos = new FileOutputStream(pdfFile);
            JasperReport report = (JasperReport) JRLoader.loadObject(getResourceAsStream(linkJasper));
            JRDataSource dataSource = new JRBeanCollectionDataSource(objs);
            JasperReportsUtils.renderAsPdf(report, params, dataSource, pos);
            files.add(pdfFile) ;
        }

        File mergedFile = File.createTempFile("courriers", ".pdf");
        PDFMergerUtility PDFmerger = new PDFMergerUtility();
        PDFmerger.setDestinationFileName(mergedFile.getAbsolutePath());
        for (File file : files) {
            PDDocument doc = PDDocument.load(file);
            PDFmerger.addSource(file);
            doc.close();
        }
        PDFmerger.mergeDocuments();


        InputStreamResource resource = new InputStreamResource(new FileInputStream(mergedFile));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", mergedFile.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(mergedFile.length()).contentType(MediaType.parseMediaType("application/pdf")).body(resource);
        return responseEntity;

    }

}
