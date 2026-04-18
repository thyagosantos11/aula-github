import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int tabuada = scanner.nextInt();

        if (tabuada < 0) {
            System.out.println("erro");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }        }
        scanner.close();
    }
}