import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        var calculadoraPai = new CalculadoraPai();
        var calculadoraFilhaNaoViola = new CalculadoraFilhaNaoViola();
        var calculadoraFilhaViola = new CalculadoraFilhaViola();

        Scanner login = new Scanner(System.in);
        System.out.println("Digite o seu salario Bruto");
        Double salarioBruto = login.nextDouble();

        System.out.println("Digite o seus descontos");
        Double descontos = login.nextDouble();

        System.out.println("Digite o seu bonus");
        Double bonus = login.nextDouble();

        try {
            double salarioLiquidoPai = calculadoraPai.calcular(salarioBruto, descontos, bonus);
            System.out.println("Classe pai tem R$" + salarioLiquidoPai + " de salário liquido");
            System.out.println();

            double salarioLiquidoFilha1 = calculadoraFilhaNaoViola.calcular(salarioBruto, descontos, bonus);
            System.out.println("Classe FilhaNãoViola tem R$" + salarioLiquidoFilha1 + " de salário liquido");
            System.out.println();

            double salarioLiquidoFilha2 = calculadoraFilhaViola.calcular(salarioBruto, descontos, bonus);
            System.out.println("Classe FilhaViola tem R$" + salarioLiquidoFilha2 + " de salário liquido");
            System.out.println();

        } catch (CalculadoraException e) {
            System.err.println("Ocorreu um problema amigão");
        }
    }
}