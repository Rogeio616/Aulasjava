
import java.util.Scanner;

public class OrdemCouD {
    public static void main(String[] args) {
        Scanner tcr = new Scanner(System.in);
        int aux = 0;
        System.out.print("Quantos valores: ");
        int n = tcr.nextInt();
        System.out.println("Ordem Crescente ou Decrescente: [c/d]");
        String CouD = tcr.next();
        int v[] = new int[n];
	if()
        for (int i = 0; i < v.length; i++) {
            v[i] = tcr.nextInt();
        }
        if(CouD.equals("c") || CouD.equals("C")){
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length; j++) {
                    if(v[i] < v[j]){
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
                }
            }
        }else if(CouD.equals("d") || CouD.equals("D")){
            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v.length; j++) {
                    if(v[i] > v[j]){
                        aux = v[i];
                        v[i] = v[j];
                        v[j] = aux;
                    }
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}