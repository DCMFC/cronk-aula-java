package conversion.example;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Success Test.
     */
    @Test
    public void fileToBase64StringConversion() throws IOException {
        String path = "src/test/java/conversion/example/test.jpg";
        ImageConversion imageConversion = new ImageConversion();
        String result = imageConversion.convertImageToBase64(path);

        assertNotNull(result);
    }
}
