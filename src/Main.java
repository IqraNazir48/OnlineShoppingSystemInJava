import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc=new Scanner(System.in);

    public static String writeToFile(File fileName,Costumer customer){
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(customer.userId + "," + customer.name + "," + customer.getMail() + "," + customer.getPassword()+","+customer.getAddress().getCountry()+","+customer.getAddress().getCity()+","+customer.getAddress().getStreetNo()+","+customer.getAddress().getHouseNo()+","+customer.previous_shopping+"\n");

            bufferedWriter.close();
            return "Operation successful!";
        }catch(Exception exp){
            return "Error Occurred!";
        }
    }

    public static Costumer ReadFromFile(File fileName,String email,String password) {
        try {
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            //1,Zahra,zahra@,22,Pakistan,Lhaore,1,3,0.0
            while((line=bufferedReader.readLine())!=null){

                String[] strings=line.split(",");
                if(strings[2].equals(email)){

                    System.out.println("Email verified!");
                    if(strings[3].equals(password)){
                        System.out.println("Password verified!");
                        System.out.println("Congratulations! Your account verified successfully!");
                        bufferedReader.close();
                        Address address=new Address(strings[5],Integer.parseInt(strings[6]),strings[4],Integer.parseInt(strings[7]));
                        return new Costumer(Integer.parseInt(strings[0]),strings[1],strings[2],strings[3],address);
                    }
                }
            }
            bufferedReader.close();
        }catch(Exception exp){
            System.out.println("Error Occurred while reading!");
        }
        return null;
    }


    //checking if email exists
    public static int emailExistence(File fileName,String email) {
        int flag=0;
        try {
            FileReader fileReader=new FileReader(fileName);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                String[] strings=line.split(",");
                if(strings[2].equals(email)){
                    flag=1;
                    System.out.println("Email Already exists! Try another one!");
                    break;
                }
            }
            bufferedReader.close();
        }catch(Exception exp){
            System.out.println("Error Occurred while reading!");
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File file=new File("Record.txt");
        Costumer currentCustomer=null;
        Address currentCustomerAddress  =null;
        System.out.println("Enter 1 to signIn and 2 to signUp");
        int choice=sc.nextInt();
        int flag=0;
        if(choice==1){
            sc.nextLine();
            System.out.println("Enter your email!");
            String email=sc.nextLine();
            System.out.print("Enter your password: ");
            String pass=sc.nextLine();
            Costumer cus=ReadFromFile(file,email,pass);
            if(cus!=null){
                currentCustomer=cus;
            }
            else{
                flag=1;
                System.out.println("Sorry! Your account not verified!");
                System.out.println("You can signUp to a new account!");
            }

        }
        if(choice==2 || flag==1){
            sc.nextLine();
            String email=null;
            int email_check=1;
            System.out.print("Enter your email: ");
            while (email_check==1){
                email=sc.nextLine();
                email_check=emailExistence(file,email);
            }
            System.out.print("Enter your password: ");
            String password=sc.nextLine();
            System.out.print("Enter your name: ");
            String name=sc.nextLine();
            System.out.print("Enter your id: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your Country name: ");
            String country=sc.nextLine();
            System.out.print("Enter your city name: ");
            String city=sc.nextLine();
            System.out.print("Enter your street number: ");
            int streetNo=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your house number: ");
            int houseNo=sc.nextInt();
            sc.nextLine();
            currentCustomerAddress=new Address(city,streetNo,country,houseNo);
            currentCustomer=new Costumer(id,name,email,password,currentCustomerAddress);


            String writing=writeToFile(file,currentCustomer);
           System.out.println(writing);
        }
        //accessing the name of current Customer
        System.out.println("Hello "+currentCustomer.name);

        double price=currentCustomer.method();
    }
}


