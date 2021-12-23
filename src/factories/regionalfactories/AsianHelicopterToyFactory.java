package factories.regionalfactories;

import factories.ToyFactory;
import product.models.AsianHelicopterToy;
import toyproduct.Toy;

public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(int num) {
        return new AsianHelicopterToy(num);
    }
}
