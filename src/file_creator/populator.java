package file_creator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class populator {
    public void populateFile(){
        try {
            File myDummy = new File("dummy.txt");
            if (myDummy.createNewFile()) {
                FileWriter myWriter = new FileWriter("dummy.txt");
                myWriter.write("This is a dummy file for CI/CD homework.");
                myWriter.close();
            }
            else{
                throw new java.io.IOException();

            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void removeDummyFile(){
        try {
            File myDummy = new File("dummy.txt");
            if (myDummy.delete()) {
                ;
            }
            else{
                throw new java.io.IOException();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
