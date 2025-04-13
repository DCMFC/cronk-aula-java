package conversion.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * Convert Image class.
 */
public class ImageConversion {

    /**
     * Convert image to base64 method.
     */
    public String convertImageToBase64(String path) throws IOException, InvalidPathException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        String encodedString = Base64.getEncoder().encodeToString(bytes);
        return encodedString;
    }

    /**
     * Convert base64 to image method.
     */
    public void convertBase64ToImage(String base64) throws IOException {
        String fileName = "image-output.jpg";
        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        Path destinationFile = Paths.get(".", fileName);
        Files.write(destinationFile, decodedBytes);
    }

}
