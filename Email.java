import java.util.*;
import java.io.*;

public class Email {
    public Scanner SC = new Scanner(System.in);

    // setting variables as private to not give direcly
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    private int mailCapacity = 500;
    private String alter_email;

    // constructor to receive firstname and lastname
    public Email(String fname, String lname,){
        this.fname = fname;
        this.lname = lname;
        System.out.println("New Employee: " +this.fname+ "" +this.lname);

        // calling methods
        this.dept = this.setDept();
        this.password = this.generatePass(20);
        this.email = this.generateEmail();

    }

    //generate main method
    private String generateEmail(){
        return this.fname.toLowerCase()+ "." +this.lname.toLowerCase()+ "@" +this.dept.toLowerCase() + ".company.com";

    }
    //Asking for department
    private String setDept(){
        System.out.println("Department Code \n1 for Sales \n2 for development \n3 for accounting department \n none");
        boolean flag = false;
        do {
            System.out.println("Enter Department Code");
            int choice  = SC.nextInt();
            switch (choice){
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("invalid choice");

            }
        } while(!flag)
            return null;
    }
    // generate random pass method
    private string generatePass (int length){
        Random r = new Random();
        String CaptialLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SmallLetter = "abcdefghijklmnopqrstuvwxyz";
        String Number = "0123456789";
        String Symbols = "!@£$%^&*?";
        String Value = CaptialLetter+SmallLetter+Number+Symbols;
        String Password = "";
        for (int i = 0; i < length; i++){
            Password = Password+values.charAt(r.nextInt(values.lenth()))
        }
        return password;
    }
    // Change password method
    public void SetPassword(){
        boolean flag = false;
        do {
            System.out.println("Do you want to change your password!(Y/N)");
            char choice = SC.next().charAt(0);
            if(choice == 'Y' || choice == 'y')
                flag = true;
            System.out.println("Enter Current Password");
            String temp = SC.next();
            if(temp.equals(this.password)){
                System.out.println("Enter new Password");
                this.password = SC.next;
                System.out.println("Password Changed Succcesfully");

            }else{
                System.out.println("incorrect Password");
            }else if(choice == 'N' || choice == 'n'){
                flag = true;
                System.out.println("Password changed option cancelled");
            }else {
                System.out.println("Ente Valid Choice");
            }

        }while(!flag);
    }

    // set mailbox capacity method
    public void SetMailCap(){
        System.out.println("Current Capacity = " +this.mailCapacity+ "mb");
        System.out.println("Enter new mailbox capacity: ");
        this.mailCapacity = SC.nextInt;
        System.out.println("Mailbox capacity is successfully changed");
    }
   // set AlternateEmail
    public void AlternateEmail(){
        System.out.println("Enter alternate mail");
        this.alter_email = SC.next();
        System.out.println("Alternate email is set");
    }
    // Display user information method
    public void GetInfo(){
        System.out.println("New: " +this.fname " " +this.lname);
        System.out.println("Department: " +this.dept);
        System.out.println("Email: " +this.email);
        System.out.println("Password: " +this.password);
        System.out.println("number Capacity: " +this.mailCapacity);
        System.out.println("Alternate Mail: " +this.alter_email);
    }

}
