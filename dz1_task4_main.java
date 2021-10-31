
public class dz1_task4_main {

    static int getNumberOfPairs(int[] intArray){
    int n =0;
    for (int i = 0; i < intArray.length; i++) {
        for (int j = i+1; j < intArray.length; j++) {
            if (intArray[i] == intArray[j]){
                n++;
            }
        }
    }
    return n;
    }
    
    public static void main(String[] args) {
        String[] strArray = args[0].split(",");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        System.out.print(getNumberOfPairs(intArray));
    }
    
}
