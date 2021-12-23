package factories.regionalfactories;

import factories.ToyFactory;
import product.models.AmericanHelicopterToy;
import toyproduct.Toy;

public class AmericanHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(int num) {
        return new AmericanHelicopterToy(num);
    }
    
}
