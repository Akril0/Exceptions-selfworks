package Task2;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
        Rialto weak = new Rialto(5);
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Input day which you want to watch: ");
            System.out.println(weak.rialto[scanner.nextInt() - 1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You inputted wrong number");
        }

    }
}
