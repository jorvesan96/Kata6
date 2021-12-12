package kata6;

import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;


public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator serial = new SerialNumberGenerator();
        Scanner sc = new Scanner(System.in);
        String inst = "";
        while(true){
            inst = sc.nextLine();
            if(inst.equals("exit"))break;
            Car coche = new Car(serial.next());
            coche.pack();
            coche.label();
        }
    }
    
}
