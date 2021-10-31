import java.util.*;
public class dz1_task5_main {

    static String sortGuestList(String input){
        String sorted_list = "";
        String[] full_names = input.split(")|\\(");
        ArrayList<String> unsorted_list = new ArrayList<String>();
        for (int i = 0; i < full_names.length; i++){
            if(full_names[i].length() >0){
                unsorted_list.add(full_names[i]);
            }
        }
        Collections.sort(unsorted_list);
        for (int j = 0; j < unsorted_list.size(); j++) { 		      
          sorted_list+="("+unsorted_list.get(j)+")"; 		
        }   	
        
        return sorted_list;
    }
    
    public static void main(String[] args) {
        System.out.print(sortGuestList(args[0].toUpperCase()));
    }
    
}
