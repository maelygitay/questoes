import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário o número a ser verificado na sequência de Fibonacci
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // define os primeiros valores da sequência
        int valor1 = 0;
        int valor2 = 1;
        int proximoValor = valor1 + valor2;

        // percorre a sequência até encontrar o número informado ou ultrapassá-lo
        while (proximoValor <= numero) {
            if (proximoValor == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci!");
                return;
            }
            valor1 = valor2;
            valor2 = proximoValor;
            proximoValor = valor1 + valor2;
        }

        // caso o número não seja encontrado
        System.out.println(numero + " não pertence à sequência de Fibonacci!");
    }
}