/*
Dada a classe ContaBancaria pré-existente, escreva uma classe ContaCorrente que herde de ContaBancaria e implemente a(s) propriedade(s) abaixo:

possuiChequeEspecial (booleano)
limiteDoChequeEspecial (double)
Além dos atributos, esta classe deverá conter os métodos:

modificarLimiteChequeEspecial(double novoLimite) - Caso a conta tenha cheque especial, modifica o limite para o valor informado por parâmetro, caso o novo limite seja maior ou igual a zero. Se o novo limite for menor do que zero, não altera o limite.
Demais características:

O construtor da classe ContaCorrente deve receber a agencia, a conta e se possui cheque especial, exatamente nesta sequência de parâmetros. Caso tenha cheque especial, o limite inicial deve ser de R
500
,
00.
C
a
s
o
c
o
n
t
r
a
ˊ
r
i
o
,
o
l
i
m
i
t
e
s
e
r
a
ˊ
R
500,00.Casocontr 
a
ˊ
 rio,olimiteser 
a
ˊ
 R 0. 

 */

class ContaCorrente extends ContaBancaria {
    private boolean possuiChequeEspecial;
    private double limiteDoChequeEspecial;

    public ContaCorrente(String agencia, int conta, boolean possuiChequeEspecial) {
        super(agencia, conta);
        this.possuiChequeEspecial = possuiChequeEspecial;
        this.limiteDoChequeEspecial = possuiChequeEspecial ? 500.00 : 0;
    }

    public void modificarLimiteChequeEspecial(double novoLimite) {
        if (novoLimite >= 0) {
            this.limiteDoChequeEspecial = novoLimite;
        }
    }

    public boolean isPossuiChequeEspecial() {
        return possuiChequeEspecial;
    }

    public void setPossuiChequeEspecial(boolean possuiChequeEspecial) {
        this.possuiChequeEspecial = possuiChequeEspecial;
    }

    public double getLimiteDoChequeEspecial() {
        return limiteDoChequeEspecial;
    }

    public void setLimiteDoChequeEspecial(double limiteDoChequeEspecial) {
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }
}