package conversion.example;

import java.io.IOException;

/**
 * Main class.
 */
public final class App {
    private App() {
    }

    /**
     * Main method.
     */
    public static void main(String[] args) {
        String path = "src/main/java/conversion/example/images/image-1.jpg";
        ImageConversion imageConversion = new ImageConversion();
        try {
            String base64Image = imageConversion.convertImageToBase64(path);
            System.out.println(base64Image);

            imageConversion.convertBase64ToImage(base64Image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
