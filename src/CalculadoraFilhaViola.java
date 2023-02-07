import java.util.Objects;
import java.util.Scanner;

public class CalculadoraFilhaViola extends CalculadoraPai {
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) throws CalculadoraException {
        try {
            System.out.println("Voce faltou alguns dias será descontando 700 reais do seu salário, concorda? S/N");

            Scanner input = new Scanner(System.in);
            String resposta = input.next();
            double diminuirSalario = 700.00;
            if (resposta.equalsIgnoreCase("S")) {
                salarioBruto -= diminuirSalario;

                return super.calcular(salarioBruto, descontos, bonus);
                //throw new IllegalArgumentException("Argumento invalido");
            } else if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Como não aceitou será forçado a pagar, e descontado o dobro do valor");
                descontos = diminuirSalario * 2;

                return super.calcular(salarioBruto, descontos, bonus);
            } else
                return super.calcular(salarioBruto, descontos, bonus);

        } catch (Exception e) {
            System.err.println("Errou ai amigão");
            throw new RuntimeException("Classe filha violou a classe pai");
        }

    }
}