package kata6;

import java.util.Scanner;
import toys.ToyBusiness;


public class Kata6 {

    public static void main(String[] args) {
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
                    toy.createToy("car");
                    break;
                case "helicopter":
                    toy.createToy("helicopter");
                    break;
                default:
                    System.out.println("Command unknown!");
                    
            }
            if (exit) break;
            
            
        }
    }
    
}
