import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number;
        double result = 1;

        System.out.println("Enter number:");
        number = input.nextInt();
        for(int i=2;i<=number;i++){
            result+=1.0/i;
        }

        System.out.println("Result: " + result);
    }
}
