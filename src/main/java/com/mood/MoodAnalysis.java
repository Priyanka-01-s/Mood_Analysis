package com.mood;

public class MoodAnalysis {

    private String message;

    public MoodAnalysis() {
        this.message = "";
    }

    public MoodAnalysis(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    // Setter for message field
    public void setMessage(String message) {
        this.message = message;
    }

    public String happySadAnalysis() throws MoodAnalysisException{
        try{
            if (message == null || message.trim().isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MOOD); 
            }
            else if(message.toLowerCase().contains("happy")){
                return Mood.HAPPY.toString();
            }else if(message.toLowerCase().contains("sad")){
                return Mood.SAD.toString();
            }else{
                throw new MoodAnalysisException(MoodAnalysisError.INVALID_MOOD);
            }

        }catch(MoodAnalysisException e){
            throw e;

        }
    }

    public enum Mood{
        HAPPY,
        SAD
    }
   
}
