public class CalculadoraFilhaNaoViola extends CalculadoraPai{
    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus) throws CalculadoraException {
        double total =  super.calcular(salarioBruto, descontos, bonus);
        double comissao = salarioBruto * 0.5;
        return total + comissao;
    }
}
