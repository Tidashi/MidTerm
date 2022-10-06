import java.util.Scanner;

public class MidtermQ8 {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scrn.nextInt();
        for(int i = 1; i <= number; i++){
            if(!isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int a){
        for(int j = 2; j < a; j++){
            if(a%j == 0){
                return false;
            }
        }
        return true;
    }
}
