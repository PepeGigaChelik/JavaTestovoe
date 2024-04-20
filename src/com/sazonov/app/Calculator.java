package com.sazonov.app;

import com.sazonov.convert.RimConvert;
import java.io.IOException;
import java.util.Scanner;

public class Calculator{
    public static final String ERROR = "Error";
    public static boolean FLAG = true;
    public static final String[] oper = {"+", "*", "-", "/"};

    public static void main(String[] args) throws Exception {
        System.out.println("Enter NumberOne, operator, NumberTwo: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replaceAll(" ","");

        int numberOne = 0, numberTwo = 0;
        String operation = "";

        for(String x: oper) {
            if (str.indexOf(x) != -1) {
                operation = x;
                String str1 = str.substring(0, str.indexOf(x));
                String str2 = str.substring(str.indexOf(x) + 1);
                if (str1 == "" ||str2 == "" ) throw new IOException(ERROR);

                try{
                    numberOne = Integer.parseInt(str1);
                    numberTwo = Integer.parseInt(str2);
                } catch (Exception Arab){
                    try {
                        numberOne = (RimConvert.valueOf(str1).getArabNumber());
                        numberTwo = (RimConvert.valueOf(str2).getArabNumber());
                        FLAG = false;
                    } catch (Exception Rim){
                        throw new IOException(ERROR);
                    }
                }
                break;
            }
        }

        if(operation == "" || 0 > numberOne || numberOne > 10 || 0 > numberTwo || numberTwo > 10) throw new IOException(ERROR);

        int result= 0;
        switch (operation){
            case "+":
                result = numberOne + numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
        }
        if(FLAG)
        System.out.println(result);
        else {
            if (result < 1) throw new IOException(ERROR);
            for (RimConvert Rim : RimConvert.values())
                if (Rim.getArabNumber() == result) {
                    System.out.println(Rim.getRimNumber());
                    break;
                }
        }
    }
}