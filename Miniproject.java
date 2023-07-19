import java.util.*;
public class Miniproject {
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        int var2=(int)(Math.random()*10);
        System.out.println(var2);
        int var3=0;
        for (int i=var3;i<=3;i++){
            System.out.println("Enter to Guess the number Between 1 to 10.");
            var3=var.nextInt();
            if (var3==var2){
                System.out.println("yes,Your guess is correct.");
            }
            else if (var3<var2) {
                System.out.println("No,Choose Greter Number.");
            }
            else if (var3>var2) {
                System.out.println("No,Choos lesser Number.");
            }
            else {
                System.out.println("invalid input");
            }

        }

    }
}
