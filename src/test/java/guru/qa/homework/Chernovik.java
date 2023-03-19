package guru.qa.homework;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Chernovik {

    /*ClassLoader cl = HomeworkZipTest.class.getClassLoader();

    @Test
    void zipParseHomeworkTest() throws Exception{

    try {
        final ZipFile zipFile = new ZipFile(chooser.getSelectedFile());
        final Enumeration<? extends ZipEntry> entries = zipFile.entries();
        ZipInputStream zipInput = null;

        while (entries.hasMoreElements()) {
            final ZipEntry zipEntry = entries.nextElement();
            if (!zipEntry.isDirectory()) {
                final String fileName = zipEntry.getName();
                if (fileName.endsWith(".pdf")) {
                    *//*try (InputStream resourceAsStream = cl.getResourceAsStream("unpacked-zip/sample.pdf")) {
                        PDF content = new PDF(resourceAsStream);
                        assertThat(content.text).contains("This is a small demonstration");
                    }*//*
                    zipInput = new ZipInputStream(new FileInputStream("unpacked-zip/sample.pdf"));
                    PDF content = new PDF(zipInput);
                    assertThat(content.text).contains("This is a small demonstration");

                    *//*final RandomAccessFile rf = new RandomAccessFile(fileName, "r");
                    String line;
                    while((line = rf.readLine()) != null) {
                        System.out.println(line);
                    }
                    rf.close();*//*
                    zipInput.closeEntry();
                }
            }
        }
        zipFile.close();
    }
catch (final IOException ioe) {
        System.err.println("Unhandled exception:");
        ioe.printStackTrace();
        return;
    }
    }*/
}
