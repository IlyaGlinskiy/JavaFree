package by.glinkiy.lesson5.tast26;

public class ElectricCooker extends Cookers{
    private int powerKWt;
    private boolean isOn;

    public ElectricCooker(int length, int width, int height, String type, int powerKWt) {
        super(length, width, height, type);
        this.powerKWt = powerKWt;
    }

    public void socketOff(){
        this.isOn=false;
    }
    public void socketOn(){
        this.isOn=true;
    }
    public void printStateSocket(){
        System.out.println("Socket On: "+isOn);
    }
}
