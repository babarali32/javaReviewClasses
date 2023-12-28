public class WhileLoop {
    public static void main(String[] args) {
        // print numbers from 1 to 20
        int number=0;
        while(number<=20){
            System.out.print(number+" ");
            number++;
        }
        System.out.println("---------------------");
        // print numbers from 50 to 1
        int a=50;
        while (a>=1){
            System.out.print(a+" ");
            a--;
        }

        // enter 1 to 10 even nubmers
        int b=1;
        while(b<10){
            if(b%2==0){
                System.out.println(b);
            }
            b++;
        }
        System.out.println("---------------------");
        boolean workday=true;
        int day=1;
        while(workday){
            System.out.println("i need a day off");
            day++;
            if(day==6){
                System.out.println("i dont need day off");
                workday=false;
            }

        }
    }

}
