package com.moodanalyser;

import java.util.ArrayList;

public class MoodAnalyserProblem {

    //
    public boolean analyseMood(String message) {
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
        MoodAnalyserProblem moodAnalyserProblem =new MoodAnalyserProblem();
        moodAnalyserProblem.analyseMood("i am so sad");
    }
}
