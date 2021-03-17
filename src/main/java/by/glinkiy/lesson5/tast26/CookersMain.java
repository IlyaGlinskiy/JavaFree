package by.glinkiy.lesson5.tast26;

public class CookersMain {
    public static void main(String[] args) {
        ElectricCooker electricCooker = new ElectricCooker(600, 600, 800, "floor kitchen cooker",2);
        ElectricCooker electricCooker1 = new ElectricCooker(600, 400, 200, "built-in cooker",1);
        electricCooker.printStateSocket();
        electricCooker1.socketOn();
        electricCooker1.printStateSocket();
    }
}
