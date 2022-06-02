
import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mode;


        System.out.println("------------------------Welcome---------------------------");
        System.out.println("   Fahrenheit to Celsius/Celsius to Fahrenheit Converter");

        do {
            System.out.println("Choose the conversion mode: ");
            System.out.println("Enter 1 for Fahrenheit to Celsius: ");
            System.out.println("Enter 2 for Celsius to Fahrenheit: ");
            mode = scan.nextInt();

        while (mode != 1 && mode != 2){
        System.out.println("Entry not valid, try again!!");
        mode = scan.nextInt();
        }


        if (mode == 1) {
            System.out.println("Enter temp to convert: ");
            double tempConvert = scan.nextDouble();
            double C = (tempConvert - 32) * 5 / 9;
            System.out.println(tempConvert + " f -------> " + C + " celsius");
        } else {
            System.out.println("Enter temp to convert: ");
            double tempConvert = scan.nextDouble();
            double F = (tempConvert * 9 / 5) + 32;
            System.out.println(tempConvert + " c -----> " + F + " fahrenheit");
        }
        System.out.println("Do you want to convert another temp? 1-Yes / 2- No");
        mode = scan.nextInt();

        while (mode != 1 && mode != 2) {
            System.out.println("Entry not valid, try again!!");
            mode = scan.nextInt();
        }
    }
        while (mode == 1);
        System.out.println("----------- Good bye!!!!!------------");
        }




    }





