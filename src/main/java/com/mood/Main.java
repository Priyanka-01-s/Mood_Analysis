package com.mood;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----WELCOME TO MOOD ANALYSER-------\n");
        String message = "I am feeling happy!";
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);
        String result = moodAnalysis.happySadAnalysis();

        String message2 = "I am feeling sad!";
        MoodAnalysis moodAnalysis2 = new MoodAnalysis(message2);
        String result2 = moodAnalysis2.happySadAnalysis();
        System.out.println(result);
        System.out.println(result2);

    }
}