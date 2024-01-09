import java.util.Scanner;

public class Even_odd {
        public static void main(String[] args) {
            Scanner output = new Scanner(System.in);
            System.out.print("Enter num: ");
            int x = output.nextInt();
            if(x%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
            output.close();
        }
}
