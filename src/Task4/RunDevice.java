package Task4;

import java.util.Scanner;

public class RunDevice {
    public static void main(String[] args) throws TooColdException, TooHotException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the temperature: ");
        int temperature= scanner.nextInt();
        if(temperature<-10) throw new TooColdException();
        else if(temperature > 30) throw new TooHotException();
        else System.out.println("Device is working");
    }
}
