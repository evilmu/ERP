import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String string = scanner.nextLine();
        scanner.close();
        
        int count = contaLetraA(string);
        if (count > 0) {
            System.out.println("A letra 'a' ocorre " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }
    }

    public static int contaLetraA(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}
