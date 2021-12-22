package factories.regionalfactories;

import factories.ToyFactory;
import product.models.AmericanCarToy;
import product.models.AmericanHelicopterToy;
import toyproduct.Toy;

public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "Car":
                AmericanCarToy car = new AmericanCarToy(num.next());
                car.pack();
                car.label();
                return car;
            case "Helicopter":
                AmericanHelicopterToy heli = new AmericanHelicopterToy(num.next());
                heli.pack();
                heli.label();
                return heli;
            default:
                return null;
        }
        
    }
    
}
