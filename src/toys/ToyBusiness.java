package toys;

public class ToyBusiness {
    public final SerialNumberGenerator num = new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(this.num.next());
        car.pack();
        car.label();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter heli = new Helicopter(this.num.next());
        heli.pack();
        heli.label();
        return heli;
    }
}
