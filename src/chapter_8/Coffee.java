package chapter_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    void addCondiments() {
        System.out.println("Add Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IOerror trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
