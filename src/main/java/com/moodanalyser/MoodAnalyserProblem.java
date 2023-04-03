package com.moodanalyser;

import java.security.PrivateKey;

public class MoodAnalyserProblem {

    private String message;
    //Default constructor
    public MoodAnalyserProblem() {
    }
    //Parameterized constructor
    public MoodAnalyserProblem(String message) {
        this.message = message;
    }
    /*this method will analyse the message and give true or false as output of mood.
    -I used try catch block to get the exception if user enter 'null' as message.
     */
    public boolean analyseMood() {
        boolean result = false;
        try{
            String[] words = message.split(" ");
            for (int i =0; i < words.length; i++) {
                if (words[i].equals("sad")) {
                    result = true;
                    break;
                }
            }
            if (result) {
                System.out.println("you are in Sad mood: ");
            }else {
                System.out.println("you are in happy mood: ");
            }
        } catch (NullPointerException e) {
            System.out.println("The Exception is : " +e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser problem: ");
        MoodAnalyserProblem moodAnalyserProblem = new MoodAnalyserProblem("i am in sad mood");
        moodAnalyserProblem.analyseMood();
        MoodAnalyserProblem moodAnalyserProblem1 = new MoodAnalyserProblem(null); //Here i am creating the object with null value which will throw an exception.
        moodAnalyserProblem1.analyseMood();
    }
}
