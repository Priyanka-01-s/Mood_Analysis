package com.mood;

public class MoodAnalysisException extends Exception {

    private final MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error) {
        super(error.getMessage());
        this.error = error;
    }

    public MoodAnalysisError getError(){
        return error;
    }
    
}
