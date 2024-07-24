import java.io.*;
import java.util.Scanner;

public class FileHandling{
    BufferedWriter writer;
    BufferedReader reader;
    FileHandling(FileWriter fileWriter,FileReader fileReader){
        writer=new BufferedWriter(fileWriter);
        reader=new BufferedReader(fileReader);
    }
    public void fileWriting(String string) throws IOException {
        writer.write(string);
    }
    public void fileReading(String email) throws IOException {
        Scanner sc=new Scanner(System.in);
        String line;
        int flag=0;
        while ((line=reader.readLine())!=null) {
            String[] string=line.split(" ");
            if(string[0]==email){
                System.out.println("Your email exists!");
                System.out.println("Enter Your Password!");
                String password=sc.nextLine();
                if(password==string[1]) {
                    System.out.println("Your account exists!");
                    System.out.println("You have successfully verified!");
                    flag = 1;
                }
                if(flag!=1){
                    System.out.println("Password is wrong!");
                }

            }

        }
    }

}
