import java.util.*;
public class SpaceCraft{
    int distance;
    int fuel;
    public void calculateFuel(){
        try{
            int requiredFuel=distance/fuel;
            System.out.println(requiredFuel);
        }catch(ArithmeticException e){
            System.out.println("Invaild Fuel Efficiency");
        }
    }
}
