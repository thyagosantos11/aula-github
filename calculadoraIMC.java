import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("digite sua altura");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("seu imc é " + imc);

        if (imc > 20) {
            System.out.println("abaixo do peso");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("normal");
        } else if (imc > 30) {
            System.out.println("sobrepeso");
        }else{
            System.out.println("obeso mórbido");
        }
        scanner.close();
    }
    
}
