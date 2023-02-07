# CalculoSalario_Liskov_SOLID
Projeto de calculo de salário aplicando princípio da substituição de Liskov


ENUNCIADO


Dado a interface CalculadoraDeSalarioLiquido abaixo

public interface CalculadoraDeSalarioLiquido {
    Double calcular(Double salarioBruto, Double descontos, Double bonus);
}

Criar uma classe pai que siga a seguinte regra de negócio

1 - O salarioBruto não pode ser menor do que o salário minimo (1302)

2 - Os descontos não podem ser maiores do que o sálario bruto

3 - O bonus não deve ser superior a 1000


Obs:

Criar pelo menos 1 exemplo de classe filha que não viole o principio da substituição de LISKOV

Criar pelo menos 1 exemplo de clase filha que viole a substituição de LISKOV
