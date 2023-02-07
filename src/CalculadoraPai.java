public class CalculadoraPai implements CalculadoraDeSalarioLiquido {
    private static final double salarioMinimo = 1032;

    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) throws CalculadoraException {

        if (salarioBruto < salarioMinimo)
            throw new CalculadoraException();

        if (descontos > salarioBruto)
            throw new CalculadoraException();

        if (bonus > 1000)
            throw new CalculadoraException();
        else
            return salarioBruto + bonus - descontos;
    }
}
