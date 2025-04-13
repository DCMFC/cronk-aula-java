import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import conversion.example.ImageConversion;
import java.io.IOException;
import java.nio.file.InvalidPathException;

/**
 * Fuzzer class.
*/
public class ConversionFuzzer {
    /**
     * Fuzzer method.
    */
    public static void fuzzerTestOneInput(FuzzedDataProvider data) {
        String input = data.consumeRemainingAsString();
        ImageConversion imageConversion = new ImageConversion();

        try {
            imageConversion.convertImageToBase64(input);
        } catch (IOException | InvalidPathException e) {
            return;
        }

        try {
            imageConversion.convertBase64ToImage(input);
        } catch (IOException e) {
            return;
        }
    }
}
