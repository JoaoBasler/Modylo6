public class Universidade {
    private String nome;
    private int qal, qpr;
    
    
    public Universidade(String nome , int qal  , int qpr  ) {
       this.nome = nome;
       this.qal = qal;
       this.qpr = qal;
    }
   
    
    public String getNome(){
        return nome;
    }
    
    public int getQal(){
        return qal;     
    }
    
    public int getQpr(){
        return qpr;
    }
    
    
   public void setNome(String nome){
         this.nome=nome;
   } 
    
  public void setQal(int qal){
       this.qal = qal;
   } 

public void setQpr(int qpr){
       this.qpr = qpr;
   }   


public void Exibe(){
System.out.println("Nome: "+nome);
System.out.println("Quantidade de alunos: "+qal);
System.out.println("Quantidade de professores: "+qpr);
}

}