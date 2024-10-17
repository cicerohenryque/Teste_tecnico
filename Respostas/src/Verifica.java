import java.util.Scanner;

public class Verifica {
    public static int contarOcorrenciasA(String texto) {
        int cont = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                cont++;
            }
        }
        
        return cont;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int ocorrencias = contarOcorrenciasA(texto);

        if (ocorrencias > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + ocorrencias + " vezes.");
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada na string.");
        }
        
        scanner.close();
    }
}