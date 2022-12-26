public class MEC {

       public void imprimeUniversidades(Universidade[]uni1 ){
         for(int i = 0;  i < uni1.length; i++){
            if(uni1[i] instanceof Privada){
            uni1[i].Exibe();
            }
                if(uni1[i] instanceof Publica){
                uni1[i].Exibe();
                }
         }
       }
   
    public void maisCara(Universidade[] uni){
        double maior = 0 ;
        int indice = 0;
        for(int i =0; i < uni.length; i++){
          if(uni[i] instanceof Privada){
            if(((Privada)uni[i]).getMensal() > maior ){
                 maior =((Privada)uni[i]).getMensal();   
                 indice = i; 
            }
          }
        }
          uni[indice].Exibe(); 
    }
    
    public void universidadesDoSul(Universidade[]uni){
        int flag = 0;
        for(int i = 0;  i<uni.length; i++){
            if(uni[i] instanceof Publica){
                if((((Publica)uni[i]).getEstado()).equals("RS")){
                uni[i].Exibe();  
                flag = 1;
                }
                if((((Publica)uni[i]).getEstado()).equals("rs")){
                uni[i].Exibe();
                flag = 1;
                }
                
                if((((Publica)uni[i]).getEstado()).equals("SC")){
                uni[i].Exibe();
                flag = 1;
                }
                if((((Publica)uni[i]).getEstado()).equals("sc")){
                uni[i].Exibe();
                flag = 1;
                }
                
                if((((Publica)uni[i]).getEstado()).equals("pr")){
                uni[i].Exibe();
                flag = 1;
                }
                if((((Publica)uni[i]).getEstado()).equals("PR")){
                uni[i].Exibe();
                flag = 1;
                }
            }
        }
            if(flag==0){
            System.out.println("Nenhum estado pertence a região sul do brasil!");
            }
    }          
}