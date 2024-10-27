import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int a1 = sc.nextInt();
        
        System.out.print("Digite um valor float: ");
        float a2 = sc.nextFloat();

        A classeA = new A(a1, a2);
        System.out.println("Imprimir o nome dos métodos da classe A:");
        classeA.ma1();
        classeA.ma2();

        B classeB = new B(a1, a2);
        System.out.println("Imprimir o nome dos métodos da classe B");
        classeB.mb1();
        classeB.mb2();


        sc.close();
    }
}
