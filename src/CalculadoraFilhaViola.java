import java.util.Scanner;

public class CalculadoraFilhaViola extends CalculadoraPai {
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) throws CalculadoraException {
        try {
            System.out.println("Voce ganhou comissao de 700 reais, digite S para acrecemtar");

            Scanner input = new Scanner(System.in);
            String resposta = input.next();

            Double salarioBrutoAdicional = 0.0;
            if (resposta == "S") {
                double decimoterceiro = 700.00;
                salarioBrutoAdicional = salarioBruto + decimoterceiro;
                throw new IllegalArgumentException("Argumento invalido");
            }
            return super.calcular(salarioBrutoAdicional, descontos, bonus);

        } catch (Exception e) {
            System.err.println("Errou ai amigão");
            throw new RuntimeException("Classe filha violou a classe pai");
        }

    }
}