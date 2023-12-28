public class continuekeyword {




    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if (i==7 || i==3 || i==2){
                continue;
            }
            // continue will skip this code once and go to for 4th iteration.
            System.out.println("hello world - "+i);


        }
    }
}
