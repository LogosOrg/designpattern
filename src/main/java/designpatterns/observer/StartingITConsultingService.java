package designpatterns.observer;

import java.util.Random;
import java.util.Scanner;

public class StartingITConsultingService {
    public static void main(String[] args) {
        int NumberOfProblems = new Random().nextInt(5);
        int selectedNumberOfProblem;
        int selectedNumberAsAnAnswer;
        int CurrentSizeOfObserverList;

        ITConsultingService SoobinCompany = new ITConsultingService();

        for (int i = 0; i <= NumberOfProblems; i++) {
            Observer problem = new Problem();
            SoobinCompany.registerObserver(problem);
        }
        SoobinCompany.getSizeOfObserverList();
        System.out.println("Do you want to set and send an answer to one of problem? (1: Yes, Other numbers : No)");
        Scanner n = new Scanner(System.in);
        int input = n.nextInt();

        if (input != 1) {
            n.close();
            System.out.println("Please start again and write 1 to start to solve the problems.(See you bye!)");
            System.exit(0);
        }
        System.out.println("Ok Let's start.");
        CurrentSizeOfObserverList = SoobinCompany.getSizeOfObserverList();

        while (CurrentSizeOfObserverList != 0) {
            CurrentSizeOfObserverList = SoobinCompany.getSizeOfObserverList();

            System.out.println("There is(are) " + CurrentSizeOfObserverList
                    + "problem(s). Which problem do you want to solve first? Please write from 0 to "
                    + (CurrentSizeOfObserverList - 1) + " to select a problem.");
            input = n.nextInt();
            if (input > (CurrentSizeOfObserverList - 1)) {
                while(input > (CurrentSizeOfObserverList - 1)){
                    System.out.println("Out of Range error. Please write from 0 to " + (CurrentSizeOfObserverList - 1) + ".");
                    input = n.nextInt();
                }
            }

            selectedNumberOfProblem = input;
            System.out.println("You selected problem(" + input
                    + ") which number do you think is the answer for this problem? 1 or 0 ? (please write 1 or 0)");
            input = n.nextInt();
            if ((input != 1) && (input != 0)) {
                while((input != 1) && (input != 0)){
                    System.out.println("Out of Range error. Please write 1 or 0.");
                    input = n.nextInt();
                }
            }
            selectedNumberAsAnAnswer = input;
            System.out.println("Is it an answer? Your answer : " + selectedNumberAsAnAnswer);
            SoobinCompany.setAnswer(SoobinCompany.getObserver(selectedNumberOfProblem), selectedNumberAsAnAnswer);
            CurrentSizeOfObserverList = SoobinCompany.getSizeOfObserverList();
            if (CurrentSizeOfObserverList != 0) {
                System.out.println("You still have pending problem list. (Please try to set more Answer to remove all observers.)");
            } else {
                System.out.println("Congratulations all problems are solved. Hope see you again soon.");
            }
        }
        n.close();
    }

}
