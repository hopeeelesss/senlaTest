package Task3;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<String> Words;

    public Sentence() {
    }

    public void setSentenceIntoWords(String sentence){
        char[] charSentence=sentence.toCharArray();
        Words.add(" ");
        for (char c:charSentence) {
            if(c==' '){
                Words.add(" ");
                continue;
            }
            Words.add(Words.remove(0) + c);
        }
    }
}
