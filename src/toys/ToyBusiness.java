package toys;

import toyproduct.Toy;
import toyproduct.models.CarToy;
import toyproduct.models.HelicopterToy;

public class ToyBusiness {
    public final SerialNumberGenerator num = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        Toy toy = new Toy() {
            
        @Override
        public void pack() {
            switch(type){
                case "car":
                    CarToy car = new CarToy(num.getSerialNumber());
                    car.pack();
                    break;
                case "helicopter":
                    HelicopterToy heli = new HelicopterToy(num.getSerialNumber());
                    heli.pack();
                    break;
                
            }
            
        }

        @Override
        public void label() {
            switch(type){
                case "car":
                    CarToy car = new CarToy(num.getSerialNumber());
                    car.label();
                    break;
                case "helicopter":
                    HelicopterToy heli = new HelicopterToy(num.getSerialNumber());
                    heli.label();
                    break;
               
            }
        }
        };
        num.next();
        toy.pack();
        toy.label();
        return toy;
    }
}
