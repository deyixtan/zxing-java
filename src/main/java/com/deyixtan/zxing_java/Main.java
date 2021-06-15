package com.deyixtan.zxing_java;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    // Takes Image buffer from stdin as input
    // Displays decoded QR content (if any)
    public static void main(String[] args) {
        try {
            BufferedImage imageBuffer = ImageIO.read(System.in);

            String output = QrReader.processImage(imageBuffer);
            if (output.trim().length() > 0) {
                System.out.println(output);
            }
        } catch (IOException e) { }
    }
}
