package kata6;

import java.util.Scanner;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;

public class Kata6 {

    public static void main(String[] args) {
        
        AmericanCarToyFactory americanCarToyFactory;
        AmericanHelicopterToyFactory americanHelicopterToyFactory;
        //AsianCarToyFactory asianCarToyFactory;
        //AsianHelicopterToyFactory asianHelicopterToyFactory;
        
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AmericanHelicopterToyFactory());
        //toyBusiness.add("car", new AsianCarToyFactory());
        //toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        
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
                    toyBusiness.produceToy(inst);
                    break;
                case "helicopter":
                    toyBusiness.produceToy(inst);
                    break;
                /*case "AsianCar":
                    asianCarToyFactory.createToy(inst);
                    break;
                case "AsianHelicopter":
                    asianHelicopterToyFactory.createToy(inst);
                    break;*/
                default:
                    System.out.println("Command unknown!");
                    
            }
            if (exit) break;
            
            
        }
    }
    
}
