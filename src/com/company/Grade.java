package com.company;

/**
 * Created by akwag on 7/25/2016.
 */
public class Grade {

    String scoreMessage = "";

    public void studentGrade(int score) {

        if (score <= 100 & score >= 90) {
            scoreMessage = "A";
            System.out.println(scoreMessage);
        }
        else if (score <= 90 & score >= 82) {
            scoreMessage = "B";
            System.out.println(scoreMessage);
        }
        else if (score <= 80 & score >= 78) {
            scoreMessage = "C";
            System.out.println(scoreMessage);
        }
        else if (score <= 77 & score >= 74) {
            scoreMessage = "D";
            System.out.println(scoreMessage);
        }
        else if (score <= 74 & score >= 62) {
            scoreMessage = "D";
            System.out.println(scoreMessage);
        }
        else {
            scoreMessage = "You failed!";
            System.out.println(scoreMessage);
        }


    }
}
