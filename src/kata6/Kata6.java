package kata6;

import java.util.Scanner;
import business.ToyBusiness;
import factories.regionalfactories.AsianToyFactory;
import factories.regionalfactories.AmericanToyFactory;

public class Kata6 {

    public static void main(String[] args) {
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        ToyBusiness americanToy = new ToyBusiness(americanToyFactory); //asianToyFactory
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
                    americanToyFactory.createToy(inst);
                    //asianToyFactory.createToy(inst);
                    break;
                case "Helicopter":
                    americanToyFactory.createToy(inst);
                    //asianToyFactory.createToy(inst);
                    break;
                default:
                    System.out.println("Command unknown!");
                    
            }
            if (exit) break;
            
            
        }
    }
    
}
