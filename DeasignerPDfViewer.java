package com.company;

public class DeasignerPDfViewer {
    public static void main(String[] args) {
        String string="zaba";
        int []ho={1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};

        System.out.println(designerPdfViewer(ho,string));
    }

    static int designerPdfViewer(int[] h, String word) {
        int START_CHR_CODE = 97;
        int height = word.chars().map(x -> h[x - START_CHR_CODE]).max().orElse(1);

        word.chars().map(x->h[x-START_CHR_CODE]).max().orElse(1);

        return height * word.length();



    }
}
