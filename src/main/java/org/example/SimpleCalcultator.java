import java.math.*;

import static java.lang.Math.round;
package org.example;

//int type = -2147483648 -> 2147483647.
public class SimpleCalcultator {
    public static void main(String[] args){
        float input=Float.parseFloat(args[0]);
        float input2=Float.parseFloat(args[2]);
        String operator=args[1];
        System.out.println(SimpleCalculation(input,input2,operator));
    }
    public static Float SimpleCalculation(float a, float b, String operator){
        float result=0;
        float mem1=0;
        //Math.round() Pourrais aider pour les nombre non float
        switch (operator){
            case "+":
                result=a + b;
                break;
            case "-":
                result=a - b ;
                break;
            case "*":
                result= a * b;
                break;
            case "/":
                result= (float) a / b;
                break;
            case "%":
                result= a % b;
                break;
            case "MEM":
                mem1=a;
                break;
            case "DELMEM":
                mem1=0;
                break;
            case "CALLMEM":
                result=mem1;
                break;

            default:
                System.out.println("Illegal Operation");
                result =100000000;
                break;
        }
        if (checkSizeLimit((int)result)>0){
            return 0.0f;
        }
        else{
            if (result instanceof(float)){
            return result);
        }
    }
    public static int checkSizeLimit(int a){
        if(a>99999999){
            return 1;
        }
        else if(a<(-99999999)){
            return 2;
        }
        else{
            return 0;
        }
    }

}
