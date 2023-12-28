import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {


        int screteNumber = 20;
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("please enter a number");
            num = scan.nextInt();

        } while (num != screteNumber);

    }
    }

