public class Publica extends Universidade {
private String estado, cidade;


public Publica(String nome, int qal, int qpr, String estado, String cidade) {
super(nome, qal, qpr);
this.cidade = cidade;
this.estado = estado;

}
public String getEstado() {
return estado;
}
public void setEstado(String estado) {
estado = this.estado;
}
public String getCidade() {
return cidade;
}
public void setCidade(String cidade) {
cidade = this.cidade;
}
public void Exibe(){
System.out.println("======DADOS DA UNIVERSIDADE PÚBLICA======");
super.Exibe();
System.out.println("Estado: "+estado);      
System.out.println("Cidade: "+cidade);
}
}