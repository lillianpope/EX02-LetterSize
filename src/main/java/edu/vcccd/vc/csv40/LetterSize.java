package edu.vcccd.vc.csv40;

public class LetterSize {
    public static void main (String args []) {
        final double MMS_PER_INCH = 25.4;
        double width = MMS_PER_INCH * 8.5;
        double height = MMS_PER_INCH * 11;
        System.out.printf("%.2f mm X %.2f mm", width, height);
        }
    }