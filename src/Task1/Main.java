package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num = 0;
        try {
            System.out.println("Input a number");
            num = Double.parseDouble(scan.next());
        }catch (NumberFormatException e){
            System.out.println("Error: " + e);
        }finally {
            System.out.println(num);
        }
    }
}
