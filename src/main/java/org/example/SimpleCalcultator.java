package org.example;

//int type = -2147483648 -> 2147483647.
public class SimpleCalcultator {
    public static int main(String[] args){
        int input=Integer.parseInt(args[0]);
        int input2=Integer.parseInt(args[2]);
        String operator=args[1];
        return SimpleCalculation(input,input2,operator);

    }
    public static int SimpleCalculation(int a, int b, String operator){
        int result=0;
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
                result= a / b;
                break;
            default:
                System.out.println("Illegal Operation");
                result =100000000;
                break;
        }
        if (checkSizeLimit(result)>0){
            return 0;
        }
        else{
            return result;
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
