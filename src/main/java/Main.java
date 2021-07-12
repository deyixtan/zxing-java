import com.google.gson.Gson;
import com.google.zxing.Result;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // Takes Image buffer from stdin as input
    // Displays decoded QR content (if any)
    public static void main(String[] args) {
        try {
            BufferedImage imageBuffer = ImageIO.read(System.in);
            ArrayList<Result> result = QrReader.processImage(imageBuffer);

            Gson gson = new Gson();
            String output = gson.toJson(result);
            if (output.trim().length() > 0) {
                System.out.print(output);
            }
        } catch (Exception e) { }
    }
}
