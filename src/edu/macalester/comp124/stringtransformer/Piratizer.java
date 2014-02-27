package edu.macalester.comp124.stringtransformer;

/**
 * Created by connor on 2/27/14.
 */

public class Piratizer extends StringTransformer {
    public int wordCount = 0;
    public int exclaimCount = 0;
    @Override
    public String transform(String s_in){
        String s_out = "";
        int s_length = s_in.length();
        for (int i = 0; i < s_length; i++){
            char current_char = s_in.charAt(i);
            if (current_char == '.'){
                s_out += ". Ahoy!";
            } else if (current_char == 'r'){
                s_out += "rrr";
            } else {
                s_out += current_char;
            }
        }
        wordCount++;
        if (wordCount % 4 == 0){
            exclaimCount++;
            if (exclaimCount % 2 == 0){
                return s_out+" arrr!";
            }
            return s_out + " ahoy!";
        }
        return s_out;
    }
    @Override
    public String toString(){
        return "Pirrratized, matey!";
    }
}
