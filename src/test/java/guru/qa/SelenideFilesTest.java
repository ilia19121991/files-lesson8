package guru.qa;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class SelenideFilesTest {
    /**
     * Если у кнопки для скачивания файла нет аттрибута href,
     * между тестами и браузера поднимается прокси-сервер, который проксирует весь трафик, детектит мой файл и сохраняет его,
     * но просто так это использовать нельзя, потому что тесты будут нестабильными. Плюс с селеноидом может не работать:
     * static {
     *         Configuration.fileDownload = FileDownloadMode.PROXY;
     *     }
     */

    @Test
    void selenideDownloadTest() throws Exception {
        open("https://github.com/junit-team/junit5/blob/main/README.md");
        File downloadedFile = $("#raw-url").download();
        try (InputStream is = new FileInputStream(downloadedFile)){
            byte[] bytes = is.readAllBytes();
            String textContent = new String(bytes, StandardCharsets.UTF_8);
            assertThat(textContent).contains("This repository is the home of the next generation of JUnit, _JUnit 5_.");
        }

    }

    @Test
    void selenideUploadFile() {
        open("https://fineuploader.com/demos.html");
        $("input[type='file']").uploadFromClasspath("example/cat.jpg");
        $("div.qq-file-info").shouldHave(text("example/cat.jpg"));

        // Если нет элемента input[type='file'],
        // то в гугле написать how to change visible attribute in element Selenium
        // и найти executeJavaScript и прописать его перед строкой $("input[type='file']")......

        //если нужно найти не текст элемента, а значение аттрибута, то нужно писать так:
        // $("span.qq-upload-file-selector").shouldHave(attribute("title", "cat.jpg"));
    }

}
