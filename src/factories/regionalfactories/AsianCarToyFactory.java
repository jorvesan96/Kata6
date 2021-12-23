package factories.regionalfactories;

import factories.ToyFactory;
import product.models.AsianCarToy;
import toyproduct.Toy;

public class AsianCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(int num) {
        return new AsianCarToy(num);
    }
}
