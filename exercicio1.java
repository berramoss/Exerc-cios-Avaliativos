import java.util.Scanner;

public class exercicio1 {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: divisão por zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = soma(num1, num2);
                    break;
                case '-':
                    resultado = subtracao(num1, num2);
                    break;
                case '*':
                    resultado = multiplicacao(num1, num2);
                    break;
                case '/':
                    resultado = divisao(num1, num2);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    scanner.close();
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
