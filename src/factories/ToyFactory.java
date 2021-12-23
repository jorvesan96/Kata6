package factories;

import toyproduct.Toy;

public abstract class ToyFactory {
   
    public Toy produceToy(int num){
        Toy toy = this.createToy(num);
        toy.pack();
        toy.label();
        return toy;
    }
    protected abstract Toy createToy(int num);
}
