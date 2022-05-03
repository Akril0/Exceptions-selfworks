package Task3;

import Task2.Rounder;

import java.util.Scanner;

public class RunWallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 10 + Math.random() * 100;
        double cost;
        System.out.println("Wallet: " + Rounder.roundValue(money) + "$");
        try{
            System.out.println("Input product`s cost");
            cost =scanner.nextDouble();
            if(cost<=money){
                System.out.println("You bought this product\n" +
                        "Wallet: " + Rounder.roundValue((money - cost)) + "$");
            }
            throw new Exception();
        } catch (Exception e) {
            System.out.println("It`s expensive for you");;
        }
    }
}
