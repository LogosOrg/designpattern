package designpatterns.observer;
import java.util.Random;

public class Problem implements Observer, DisplayStatus {
    public String status = "Problem remains.";
    Random rand = new Random();
    int upperbound = 2;
    // generate random 0 - 1
    private int secret_number = rand.nextInt(upperbound); 

    public void update(int answer){
        if (secret_number == answer) {
            System.out.println("You're right. It is the answer. This problem will be removed from the problem list.(It is not an observer anymore).");
            this.status = "Problem solved.";          
        } else {
            System.out.println("Unfortunately, It's not the answer. This problem is not solved and remains in the problem list (like an observer).");
            this.status = "Problem not solved.";
        }
    }

    public void displayStatus(){
        System.out.println(this.status);
    }
    
    public boolean isSolved(){
        if (this.status.contains("Problem solved")){
            return true;
        } else {
            return false;
        }
    }
    
}
