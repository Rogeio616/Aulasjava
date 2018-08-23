
import java.util.Scanner;

public class Receber {
    public static void main(String[] args) {
        Scanner tcr = new Scanner(System.in);
        int a  = tcr.nextInt();
        int b  = tcr.nextInt();
        
        if(a > b){
            System.out.println(a + " é o maior");
        }else if(a < b){
            System.out.println(b + " é o maior");
        }else{
            System.out.println("São iguais");
        }
    }
}
