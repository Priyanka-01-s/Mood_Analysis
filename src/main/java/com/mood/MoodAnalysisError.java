package com.mood;

public enum MoodAnalysisError {
    EMPTY_MOOD("Mood should not be empty or null"),
    INVALID_MOOD("Invalid mood provided");

    private final String message;

    MoodAnalysisError(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    
}
