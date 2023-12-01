package com.mood;

public class Main {
    public static void main(String[] args) throws MoodAnalysisException {
        System.out.println("-----WELCOME TO MOOD ANALYSER-------\n");
        String message = "I am feeling happy!";
        MoodAnalysis moodAnalysis = new MoodAnalysis(message);
        String result = moodAnalysis.happySadAnalysis();

        String message2 = "I am feeling sad!";
        MoodAnalysis moodAnalysis2 = new MoodAnalysis(message2);
        String result2 = moodAnalysis2.happySadAnalysis();

        String message3 = "I have a neutral mood today!";
        MoodAnalysis moodAnalysis3 = new MoodAnalysis(message3);
        String result3 = moodAnalysis3.happySadAnalysis();

        String message4 = null;
        MoodAnalysis moodAnalysis4 = new MoodAnalysis(message4);
        String result4 = moodAnalysis4.happySadAnalysis();

        System.out.println("Result 2: " +result);
        System.out.println("Result 2: " +result2);
        System.out.println("Result 2: " +result3);
        System.out.println("Result 4: " + result4);

    }
}