package guru.qa;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import com.opencsv.CSVReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeworkTest {
    ClassLoader cl = HomeworkTest.class.getClassLoader();

    /*@Test
    void zipParseHomeworkTest() throws Exception {
        try (
                InputStream resource = cl.getResourceAsStream("homework/homework-lesson8.zip");
                ZipInputStream zis = new ZipInputStream(resource)
        ) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                FileOutputStream fout = new FileOutputStream
                        ("C:\\Users\\ilia1\\IdeaProjects\\files-lesson8\\src\\test\\resources\\unpacked-zip");
                for (int c = zis.read(); c != -1; c = zis.read()) {
                    fout.write(c);
                }
                fout.flush();
                zis.closeEntry();
                fout.close();


                //assertThat(entry.getName()).isEqualTo("homework/homework-lesson8.zip");
            }
        }
    }*/

    @Test
    void zipParseHomework2Test() throws Exception {

        String zipFilePath = "C:/Users/ilia1/IdeaProjects/files-lesson8/src/test/resources/homework/homework-lesson8.zip";

        String destDir = "C:/Users/ilia1/IdeaProjects/files-lesson8/src/test/resources/unpacked-zip";

        unzip(zipFilePath, destDir);

    }

    private static void unzip(String zipFilePath, String destDir) {
        File dir = new File(destDir);
        // create output directory if it doesn't exist
        if (!dir.exists()) dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while (ze != null) {
                String fileName = ze.getName();
                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to " + newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    void unzippedXlsParseTest() throws Exception {
        try (InputStream resourceAsStream = cl.getResourceAsStream("unpacked-zip/file_example_XLS_10.xls")) {
            XLS content = new XLS(resourceAsStream);
            assertThat(content.excel.getSheetAt(0).getRow(5).getCell(2).getStringCellValue()).contains("Magwood");
        }
    }

    @Test
    void unzippedPdfParseTest() throws Exception {
        try (InputStream resourceAsStream = cl.getResourceAsStream("unpacked-zip/sample.pdf")) {
            PDF content = new PDF(resourceAsStream);
            assertThat(content.text).contains("This is a small demonstration");
        }
    }

    @Test
    void unzippedCsvParseTest() throws Exception {
        try (
                InputStream resource = cl.getResourceAsStream("unpacked-zip/SampleCSVFile_2kb.csv");
                CSVReader reader = new CSVReader(new InputStreamReader(resource))
                ) {
            List<String[]> content = reader.readAll();
            assertThat(content.get(1)[2]).contains("Barry French");
        }
    }

}

