package designpatterns.observer;

import java.util.Random;

public class StartingITConsultingService {
    public static void main(String[] args) {
        int NumberOfProblems = new Random().nextInt(10);
        ITConsultingService SoobinCompany = new ITConsultingService();
        for (int i = 0; i <= NumberOfProblems; i++) {
            Observer problem = new Problem();
            SoobinCompany.registerObserver(problem);
        }
        SoobinCompany.getPendingList();
    }

}
