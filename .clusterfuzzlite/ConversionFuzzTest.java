package conversion.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import java.io.IOException;

/**
 * Fuzz tests.
 */
public class ConversionFuzzTest {
    /**
     * Fuzz test method.
     */
    @FuzzTest
    void imageConversionFuzzTest(FuzzedDataProvider data) {
        ImageConversion imageConversion = new ImageConversion();
        String input = data.consumeRemainingAsString();

        try {
            imageConversion.convertImageToBase64(input);
        } catch (IOException e) {
            return;
        }

        try {
            imageConversion.convertBase64ToImage(input);
        } catch (IOException e) {
            return;
        }
    }
}
