package com.mood;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----WELCOME TO MOOD ANALYSER-------\n");
        String message = "I am feeling happy!";
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);
        String result = moodAnalysis.happySadAnalysis();
        System.out.println(result);

    }
}