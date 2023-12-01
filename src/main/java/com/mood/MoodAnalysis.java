package com.mood;

public class MoodAnalysis {

    private String message;

    public MoodAnalysis(String message){
        this.message = message;
    }

    public String happySadAnalysis(){
        try{

            if(message.toLowerCase().contains("happy")){
                return "HAPPY";
            }else if(message.toLowerCase().contains("sad")){
                return "SAD";
            }else{
                throw new MoodAnalysisException("Can't analyse the current mood");
            }

        }catch(MoodAnalysisException e){
            return e.getMessage();

        }
    }
   
}
