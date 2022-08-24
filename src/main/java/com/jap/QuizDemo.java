package com.jap;

public class QuizDemo {


    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        int highestScoreIndex=0;
        try {
            int maxElement=Integer.parseInt(scores[0]);
            for (int index=0;index<scores.length;index++){
                if (Integer.parseInt(scores[index])>maxElement){
                    maxElement=Integer.parseInt(scores[index]);
                    highestScoreIndex=index;
                }
            }
        }catch (NumberFormatException e){
            return e.toString();
        }


        return nameOfSchool[highestScoreIndex];

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[name.length];
        try {
            for (int index=0;index< upperCase.length;index++){
                upperCase[index]=name[index].toUpperCase();

            }
        }catch (NullPointerException exception) {
            String[] nullPointer= new String[1];
            nullPointer[0]=exception.toString();
            return nullPointer;
        }
        return upperCase;
    }
}






