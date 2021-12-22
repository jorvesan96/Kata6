package factories.regionalfactories;

import factories.ToyFactory;
import product.models.AsianCarToy;
import product.models.AsianHelicopterToy;
import toyproduct.Toy;

public class AsianToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "Car":
                AsianCarToy car = new AsianCarToy(num.next());
                car.pack();
                car.label();
                return car;
            case "Helicopter":
                AsianHelicopterToy heli = new AsianHelicopterToy(num.next());
                heli.pack();
                heli.label();
                return heli;
            default:
                return null;
        }
        
    }
    
}
