package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;


public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator serial = new SerialNumberGenerator();
        Scanner sc = new Scanner(System.in);
        String inst = "";
        boolean exit = false;
        while(true){
            inst = sc.nextLine();
            switch(inst){
                case "exit": 
                    exit=true;
                    break;
                case "car":
                    Car coche = new Car(serial.next());
                    coche.pack();
                    coche.label();
                    break;
                case "helicopter":
                    Helicopter heli = new Helicopter(serial.next(), "angelo");
                    heli.pack();
                    heli.label();
                    break;
                default:
                    System.out.println("Command unknown!");
                    
            }
            if (exit) break;
            
            
        }
    }
    
}
