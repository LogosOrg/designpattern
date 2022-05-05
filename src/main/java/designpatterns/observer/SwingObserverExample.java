package designpatterns.observer;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.event.ActionEvent;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Yes or No?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
    }

    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("No");
        }

    }

    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("Yes");
        }
    }
}
