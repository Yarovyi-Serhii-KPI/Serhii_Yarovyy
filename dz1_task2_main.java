import java.io.*;
import java.util.*;

public class dz1_task2_main {

    static String firstNonRepeatingLetter(String input){
            int cur_position = 0, i = 1;
            char[] ch = input.toCharArray();
            if (ch.length > 0){
                char current_char = ch[0];
                while(i < ch.length) {
                    if(current_char == ch[i]){
                        cur_position++;
                        current_char = ch[cur_position];
                        i = cur_position+1;
                    }
                    else{
                        i++;
                    }
                }
                String result = Character.toString(current_char);
                return result;
            }
            else{
                return "None";
            }
        }
    static void main(String[] args) 
    {
        System.out.print(firstNonRepeatingLetter(args[0]));
    }
        
}

