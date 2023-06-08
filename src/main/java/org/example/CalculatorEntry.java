package org.example;

import java.util.Arrays;

public class CalculatorEntry {
    private int numberone;
    private static String operator;
    private int numbertwo;
    private static int numberconstructor=0;
    public static int InputGrabber(String input) {
        String[] inputarray = input.split("");
        for (String StringNumeral : inputarray) {
            if(SimpleCalcultator.checkSizeLimit(numberconstructor)>0){
                break;//Si le nombre entré dépasse 9 chiffres
            }
            if (Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0").contains(StringNumeral)) {
                numberconstructor *= 10;
                numberconstructor += (Integer.parseInt(StringNumeral));
            }
            else if(Arrays.asList("+", "-", "*", "/").contains(StringNumeral)){
                operator=StringNumeral;
            }
            else{
                System.out.println("Illegal Operation");
                numberconstructor =100000000;
                break;
            }


        }System.out.println(numberconstructor);
        return 0;
    }
}
