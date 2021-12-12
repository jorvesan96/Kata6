package kata6;

import java.util.Scanner;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;


public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator serial = new SerialNumberGenerator();
        ToyBusiness toy = new ToyBusiness();
        Scanner sc = new Scanner(System.in);
        String inst = "";
        boolean exit = false;
        while(true){
            inst = sc.nextLine();
            switch(inst){
                case "exit": 
                    System.out.println("Exiting...");
                    exit=true;
                    break;
                case "car":
                    toy.createCar();
                    break;
                case "helicopter":
                    toy.createHelicopter();
                    break;
                default:
                    System.out.println("Command unknown!");
                    
            }
            if (exit) break;
            
            
        }
    }
    
}
