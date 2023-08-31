package stop_gninnips_my_sdrow;

public class SpinWords {

    public String spinWords(String sentence) {

        String[] sentenceArray = sentence.split(" ");
        for(int i=0; i<sentenceArray.length; i++){
            if(sentenceArray[i].length() >= 5){
                String resultWord = "";
                String[] temporaryArray = sentenceArray[i].split("");
                for (int j= temporaryArray.length-1; j>=0 ; j--){
                    resultWord += temporaryArray[j];
                }
                sentenceArray[i] = resultWord;
            }

        }
        String resultSentence = "";
        for(String word : sentenceArray){
            resultSentence += word + " ";
        }
        return resultSentence.trim();
    }
}

/*
https://www.codewars.com/kata/5264d2b162488dc400000001

DESCRIPTION:

Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
STRINGSALGORITHMS
 */