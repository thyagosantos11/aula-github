import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá Mundo!");
        String nome = scanner.nextLine();

        scanner.close();
        
        System.out.printf("Olá, %s!", nome);
    }
}
