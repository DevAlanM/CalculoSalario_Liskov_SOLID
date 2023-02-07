
public class CalculadoraFilhaViola extends CalculadoraPai {
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) throws CalculadoraException {
        try {
            System.out.println("Voce tem horas extras? quantas?");
            double horaextra = System.in.read();
            throw new IllegalArgumentException("Argumento invalido");
        } catch (Exception e) {
            System.err.println("Errou ai amigão");
            throw new RuntimeException("Classe filha violou a classe pai");
        }

    }
}