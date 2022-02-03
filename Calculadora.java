import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o primeiro valor? ");
        int A = sc.nextInt();
        System.out.println("Qual é o segundo valor? ");
        int B = sc.nextInt();
        System.out.println("Qual é a operação que você deseja realizar?");
        System.out.println("----MENU----");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacao = sc.nextInt();
        int resultado;
        switch (operacao){
            case 1:
                resultado = A + B;
                System.out.println("Seu resultado é: " + resultado);
                break;
            case 2:
                resultado = A - B;
                System.out.println ("Seu resultado é: " + resultado);
                break;
            case 3:
                resultado = A * B;
                System.out.println("Seu resultado é: " + resultado);
                break;
            case 4:
                resultado = A / B;
                System.out.println("Seu resultado é: " + resultado);
                break;
        }
    }
}
