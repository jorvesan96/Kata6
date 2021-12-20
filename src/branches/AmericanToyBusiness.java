package branches;

import business.ToyBusiness;
import product.models.AmericanCarToy;
import product.models.AmericanHelicopterToy;
import toyproduct.Toy;

public class AmericanToyBusiness extends ToyBusiness{

        @Override
    public Toy createToy(String type) {
        switch(type){
            case "Car":
                return this.createCar();
                
            case "Helicopter":
                return this.createHelicopter();
            default:
                return null;
        }
    }

    private AmericanCarToy createCar() {
        AmericanCarToy car = new AmericanCarToy(super.num.next());
        car.pack();
        car.label();
        return car;
    }

    private AmericanHelicopterToy createHelicopter() {
        AmericanHelicopterToy heli = new AmericanHelicopterToy(super.num.next());
        heli.pack();
        heli.label();
        return heli;
    }
}
