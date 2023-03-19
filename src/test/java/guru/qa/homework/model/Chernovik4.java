package guru.qa.homework.model;

import guru.qa.FilesParsingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static org.assertj.core.api.Assertions.assertThat;

public class Chernovik4 {

    ClassLoader cl = FilesParsingTest.class.getClassLoader();

    public static void main(String[] args) throws Exception {
        readZip();
    }

    public static void readZip() throws Exception {
        ZipFile zf = new ZipFile("homework/homework2.zip");
        for (Enumeration<? extends ZipEntry> iter = zf.entries(); iter.hasMoreElements();) {
            ZipEntry ze = iter.nextElement();
            System.out.println("Entry:" + ze.getName());
            if (!ze.isDirectory()) {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(zf.getInputStream(ze)));
                String line = null;
                while ((line = br.readLine()) != null) {
                    System.out.println("------>>>>>");
                }
            }
        }
    }
}
