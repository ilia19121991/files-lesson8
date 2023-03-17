package guru.qa.homework;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.qa.homework.model.John;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeworkJsonTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void jsonParseWithJacksonTest() throws Exception {
        File file = new File("src/test/resources/homework/sample.json");
        John john = objectMapper.readValue(file, John.class);

        assertThat(john.name).isEqualTo("John");
        assertThat(john.age).isEqualTo("30");
        assertThat(john.cars).contains("Fiat");
    }

}
