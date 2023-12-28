import java.util.Scanner;

public class taskbirthmonth {
    public static void main(String[] args) {
        //Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in June, July or August → season =”Summer”.
        //At the end of the program we should see output as “You were born ______”.
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the name of month of your birth");
        String month= scan.next();
        if(month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")){
            System.out.println(" your were born in summer season ");
        } if(month.equalsIgnoreCase("september")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")){
            System.out.println(" you wre bon in autumn");

        } if(month.equalsIgnoreCase("december")||month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")){
            System.out.println(" you were born in sprint");
        } if(month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")){
            System.out.println("you were in spring ");
        }
    }
}
