import java.util.*;
public class dz1_task3_main {
     static int getDigiRoot(int n)
    {
        int root = 0;
        while (n > 0 || root > 9)
        {
             if (n == 0) {
                n = root;
                root = 0;
            }
             
            root += n % 10;
            n /= 10;
        }
        return root;
    }
    
    public static void main(String[] args){
        System.out.print(getDigiRoot(Integer.parseInt(args[0])));
    }
}
