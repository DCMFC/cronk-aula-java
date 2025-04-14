package conversion.example;

import java.io.*;
import java.nio.file.InvalidPathException;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Test to convert from file to base64.
     */
    @Test
    public void fileToBase64StringConversion() throws IOException, InvalidPathException {
        String path = "src/test/java/conversion/example/test.jpg";
        ImageConversion imageConversion = new ImageConversion();
        String result = imageConversion.convertImageToBase64(path);

        Assertions.assertNotNull(result);
    }

    /**
     * Test to convert base64 to file.
     */
    @Test
    public void base64ToFileConversion() throws IOException, InvalidPathException {
        String path = "src/test/java/conversion/example/test.jpg";
        ImageConversion imageConversion = new ImageConversion();
        String result = imageConversion.convertImageToBase64(path);

        imageConversion.convertBase64ToImage(result);
        String expectedOutput = "image-output.jpg";
        File image = new File(expectedOutput);
        Assertions.assertTrue(image.exists());
    }
}
