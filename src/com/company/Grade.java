package com.company;

/**
 * Created by akwag on 7/25/2016.
 */
public class Grade {

    String scoreMessage = "";

    public void studentGrade(int score) {
        //Test conditions
        if (score <= 100 & score >= 90) {
            scoreMessage = "You got A";
            System.out.println(scoreMessage);
        }
        else if (score <= 90 & score >= 82) {
            scoreMessage = "You got B";
            System.out.println(scoreMessage);
        }
        else if (score <= 80 & score >= 78) {
            scoreMessage = "You got C";
            System.out.println(scoreMessage);
        }
        else if (score <= 77 & score >= 74) {
            scoreMessage = "You got D";
            System.out.println(scoreMessage);
        }
        else if (score <= 74 & score >= 62) {
            scoreMessage = "You got E";
            System.out.println(scoreMessage);
        }
        else {
            scoreMessage = "You failed!";
            System.out.println(scoreMessage);
        }

    }
}
