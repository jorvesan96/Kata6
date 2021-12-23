package factories.regionalfactories;

import factories.ToyFactory;
import product.models.AmericanCarToy;
import toyproduct.Toy;

public class AmericanCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(int num) {
        return new AmericanCarToy(num);
    }

}
