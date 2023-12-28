import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Prompt the user to enter person heights in inches.
        // Person should be classified as one of the following:
        //• short (under 60 inch)
        //• medium(between 60 -72 inch)
        //• tall (over 72 inch)

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your height in inches ");
        int height=scan.nextInt();
        if(height<60){
            System.out.println("short ");
        }
        if(height>60 && height<72){
            System.out.println(" medium ");
        }
        if(height>70){
            System.out.println("over");
        }
    }
}