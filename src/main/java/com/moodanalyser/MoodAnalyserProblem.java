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
    //this method will analyse the message and give true or false as output of mood.
    public boolean analyseMood() {
        boolean result = false;
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
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser problem: ");
        MoodAnalyserProblem moodAnalyserProblem = new MoodAnalyserProblem("i am in sad mood");
        moodAnalyserProblem.analyseMood();
    }
}
