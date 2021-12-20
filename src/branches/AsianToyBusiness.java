package branches;

import business.ToyBusiness;
import product.models.AsianCarToy;
import product.models.AsianHelicopterToy;

import toyproduct.Toy;

public class AsianToyBusiness extends ToyBusiness {

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

    private AsianCarToy createCar() {
        AsianCarToy car = new AsianCarToy(super.num.next());
        car.pack();
        car.label();
        return car;
    }

    private AsianHelicopterToy createHelicopter() {
        AsianHelicopterToy heli = new AsianHelicopterToy(super.num.next());
        heli.pack();
        heli.label();
        return heli;
    }
    
}
