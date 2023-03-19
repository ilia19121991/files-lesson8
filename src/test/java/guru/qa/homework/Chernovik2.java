package guru.qa.homework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Chernovik2 {
    ClassLoader cl = HomeworkZipTest.class.getClassLoader();


    void zipParseTest() throws IOException {
        ZipFile zipFile = new ZipFile("C:\\Users\\ilia1\\IdeaProjects\\files-lesson8\\src\\test\\resources\\unpacked-zip");

        Enumeration<? extends ZipEntry> entries = zipFile.entries();

        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            InputStream stream = zipFile.getInputStream(entry);
        }

    }
}

