package conversion.example;

import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Test to convert from file to base64.
     */
    @Test
    public void fileToBase64StringConversion() throws IOException {
        String path = "src/test/java/conversion/example/test.jpg";
        ImageConversion imageConversion = new ImageConversion();
        String result = imageConversion.convertImageToBase64(path);

        assertNotNull(result);
    }

    /**
     * Test to convert base64 to file.
     */
    @Test
    public void base64ToFileConversion() throws IOException {
        String path = "src/test/java/conversion/example/test.jpg";
        ImageConversion imageConversion = new ImageConversion();
        String result = imageConversion.convertImageToBase64(path);

        imageConversion.convertBase64ToImage(result);
        String expectedOutput = "image-output.jpg";
        File image = new File(expectedOutput);
        assertTrue(image.exists());
    }
}
