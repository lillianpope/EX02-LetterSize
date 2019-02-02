package edu.vcccd.vc.csv40;

public class LetterSize {
    public static void main(String args[]) {
        final double MMS_PER_INCH = 25.4;
        double width = 8.5 * MMS_PER_INCH;
        double height = 11 * MMS_PER_INCH;
        System.out.printf("%.2f mm X %.2f mm\n", width, height);
    }
}
