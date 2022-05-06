package designpatterns.observer;
import java.util.Random;

public class Problem implements Observer {
    Random rand = new Random();
    int upperbound = 2;
    // generate random 0 - 1
    private int secret_number = rand.nextInt(upperbound); 

    public void update(int answer){
        if (secret_number == answer) {
            System.out.println("You're right. It is the answer.");
        } else {
            System.out.println("No, It's not the answer");
        }
    }
    
}
