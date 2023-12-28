public class sumOfNumbers {
    public static void main(String[] args) {

        // calculate sum of all even numbers and odd numbers 1 to 100;
        int sumEv=0;
        int sumOdd = 0;
        for (int i = 1; i<=10; i++) {
            if (i%2==0){
                sumEv+=i;
            } else {
                sumOdd+=i;
            }

        }
        System.out.println("sum of all even number from 1 to 100 is "+sumEv+" sum of odd numbers is "+sumOdd);
    }
}
