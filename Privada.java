public class Privada extends Universidade {
private double mensal;

public Privada(String nome, int qal, int qpr, double mensal) {
super(nome, qal, qpr);
this.mensal =mensal;
}
public double getMensal() {
return mensal;
}
public void setMensal(double mensal) {
mensal = this.mensal;
}
public void Exibe(){
    System.out.println("======DADOS DA UNIVERSIDADE PRIVADA======");         
    super.Exibe();
    System.out.println("Valor da mensalidade: R$"+mensal);
}
}