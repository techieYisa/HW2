package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int question = 0;

        String[] questions = {"you're swimming in the Pacific Ocean, what do you do?", "you get eaten by a shark and die the most painful excrutiating way"};
        String[] answers ={"keep swimming", "end game"};

        System.out.println("Welcome to my game! Please answer the questions...");

        while(true) {

            System.out.println(questions[question]);

            System.out.println("Answer:  ");
            String answer = new Scanner(System.in).nextLine();

            if(answer.equals(answers[question])){
                question ++;

                if(question == questions.length)
                    break;

                System.out.println("That's obvious!");

            }
            else{
                question = 0;

                System.out.println("You would never want to do something like that, I'll give you another try.");
            }
            System.out.println("The end.");
        }

    }
}
