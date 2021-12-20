package business;

public class SerialNumberGenerator {
    private int serialNumber = 0;
    
    public int getSerialNumber(){
        return serialNumber;
    }
    
    public int next(){
        return serialNumber++ ;
    }
}
