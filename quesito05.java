import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (fim > inicio) {
            char aux = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = aux;
            inicio++;
            fim--;
        }

        String palavraInvertida = new String(caracteres);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}