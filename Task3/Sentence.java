package Task3;

import java.util.ArrayList;
import java.util.Locale;

public class Sentence {
    private ArrayList<Integer> Spaces;
    private String[] Words;
    private int vowels;
    public Sentence() {
        Spaces=new ArrayList<>();
        vowels=0;
    }

    public void setVowels(String sentence){
        char[] charSentence=sentence.toCharArray();
        for (int i=0;i<charSentence.length;i++) {
            if(charSentence[i]==' '){
                Spaces.add(i);
            }
            if(charSentence[i]=='у'||charSentence[i]=='е'||charSentence[i]=='ы'||charSentence[i]=='а'||charSentence[i]=='о'
                    ||charSentence[i]=='э'||charSentence[i]=='я'||charSentence[i]=='и'||charSentence[i]=='ю')
                vowels++;
            if(i>0 && charSentence[i - 1]==' ' && (charSentence[i]=='у'||charSentence[i]=='е'||charSentence[i]=='ы'||charSentence[i]=='а'||charSentence[i]=='о'
                    ||charSentence[i]=='э'||charSentence[i]=='я'||charSentence[i]=='и'||charSentence[i]=='ю')){
                String Upper=String.valueOf(charSentence[i]);
                Upper=Upper.toUpperCase(Locale.ROOT);
                charSentence[i]=Upper.toCharArray()[0];
            }
        }
        String finalSentence="";
        for(int i=0;i<charSentence.length;i++){
            finalSentence+=String.valueOf(charSentence[i]);
        }
        System.out.println("Конечное предложение:"+finalSentence);
        System.out.println("Кол-во гласных:"+vowels);
    }
}
