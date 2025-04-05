package conversion.example;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import org.apache.commons.io.FileUtils;

/**
 * Convert Image class.
 */
public class ImageConversion {

    /**
     * Convert image to base64 method.
     */
    public String convertImageToBase64(String path) throws IOException {
        byte[] bytes = FileUtils.readFileToByteArray(new File(path));
        String encodedString = Base64.getEncoder().encodeToString(bytes);
        return encodedString;
    }

    /**
     * Convert base64 to image method.
     */
    public void convertBase64ToImage(String base64) throws IOException {
        String fileName = "image-output.jpg";
        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        FileUtils.writeByteArrayToFile(new File(fileName), decodedBytes);
    }

}
