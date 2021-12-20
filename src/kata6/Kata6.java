package kata6;

import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import java.util.Scanner;
import business.ToyBusiness;


public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness americanToy = new AmericanToyBusiness();
        //ToyBusiness asianToy = new AsianToyBusiness();
        
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
                case "Car":
                    americanToy.createToy(inst);
                    break;
                case "Helicopter":
                    americanToy.createToy(inst);
                    break;
                default:
                    System.out.println("Command unknown!");
                    
            }
            if (exit) break;
            
            
        }
    }
    
}
