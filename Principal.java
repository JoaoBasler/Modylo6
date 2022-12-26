import java.util.Scanner;

public class Principal {
     
  
 public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
         Boolean vale1=false;
         int tamanho;
         String nome1,nome2,cidade1,estado1;
         int qal1,qal2,qpr1,qpr2;
         double mensal1;
         System.out.println("Informe a quantidade de universidades que você quer cadastar: ");
         tamanho = leia.nextInt();
         Universidade [] uni = new Universidade [tamanho];
        
         
    while(vale1=true){
        for(int i = 0; i< uni.length; i++){
            System.out.println("================================");
            System.out.println("        MENU DE CADASTRO");
            System.out.println("1 - Cadastrar Universidade Pública");
            System.out.println("2 - Cadastrar Universidade Privada");
            System.out.println("3 - Lista de universidades cadastradas");
            System.out.println("4 - Informações da universidade mais cara");
            System.out.println("5 - Informações das universidades da região sul");
            System.out.println("0 - sair");
            System.out.println("================================");
            System.out.println("   ESCOLHA UMA OPÇÃO");
            
            int opcao= leia.nextInt();
             if(opcao==0){
            System.exit(0);
            }
        
          switch(opcao){
                
                case 1: 
                    
                System.out.println("Digite o nome da universidade: ");
                String passa1= leia.nextLine();
                nome1 = leia.nextLine();
                    
                System.out.println("Digite a quantidade de alunos: ");
                qal1 = leia.nextInt();
                    
                System.out.println("Digite a  quantidade de professores: ");
                qpr1 = leia.nextInt();
                String passa3= leia.nextLine();
                    
                System.out.println("Digite o nome do estado: ");
                estado1 = leia.nextLine();
                     
                System.out.println("Digite o nome da cidade: ");
                cidade1 = leia.nextLine();
                    
                uni[i] = new Publica(nome1,qal1,qpr1,estado1,cidade1);
                    
                    System.out.println("Voltar ao menu digite 1 - Sair digite 0 ");
                    int opcao2 = leia.nextInt();
                    if(opcao2==1){
                    vale1=true;
                    break;
                    }
                    if(opcao2==0){
                    System.exit(0);
                    }
                   
                    
                case 2:
                    
                System.out.println("Digite o nome da universidade: ");
                String passa2 = leia.nextLine();
                nome2 = leia.nextLine();
                    
                System.out.println("Digite a quantidade de alunos: ");
                qal2 = leia.nextInt();
                    
                System.out.println("Digite a  quantidade de professores: ");
                qpr2 = leia.nextInt();
                    
                System.out.println("Digite o valor da mensalidade: ");
                mensal1 = leia.nextDouble();
                    
                uni[i] = new Privada(nome2,qal2,qpr2,mensal1);
                       
                        
                    System.out.println("Voltar ao menu digite 1 - Sair digite 0 ");
                    int opcao3 = leia.nextInt();
                    if(opcao3==1){
                    vale1=true;
                    break;
                    }
                    if(opcao3==0){
                    System.exit(0);
                    }
                    
                    
                case 3:
                MEC obj = new MEC();
                obj.imprimeUniversidades(uni);
                        System.out.println("Voltar ao menu digite 1 - Sair digite 0 ");
                        int opcao4 = leia.nextInt();
                        if(opcao4==1){
                        vale1=true;
                        break;
                        }
                        if(opcao4==0){
                        System.exit(0);
                        }
                        
                        
                case 4 :
                MEC obj1 = new MEC();
                obj1.maisCara(uni);
                        System.out.println("Voltar ao menu digite 1 - Sair digite 0 ");
                        int opcao5 = leia.nextInt();
                        if(opcao5==1){
                        vale1=true;
                        break;
                        }
                        if(opcao5==0){
                        System.exit(0);
                        }
                   
                        
                case 5:
                MEC obj2 = new MEC();
                obj2.universidadesDoSul(uni);
                        System.out.println("Voltar ao menu digite 1 - Sair digite 0 ");
                        int opcao6 = leia.nextInt();
                        if(opcao6==1){
                        vale1=true;
                        break;
                        }
                        if(opcao6==0){
                        System.exit(0);
                        }
          } 
        }  
    }
    }  
 } 
