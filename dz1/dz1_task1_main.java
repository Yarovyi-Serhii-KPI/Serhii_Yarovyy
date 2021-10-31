/**
 *
 * @author Serg
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dz1_task1_main {
    
    
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}

    public static List<Integer> getIntegersFromList(List<String> list){
        List<Integer> final_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(isNumeric(list.get(i))){
                final_list.add(Integer.parseInt(list.get(i)));
            }
        }
        return final_list;
    }
    
    public static void main(String[] args) 
        throws IOException {
        
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
                    
            String input = reader.readLine();
 
        String[] segregated_input = input.split(",");
        System.out.println(getIntegersFromList(Arrays.asList(segregated_input)));
    }
}
    
 
