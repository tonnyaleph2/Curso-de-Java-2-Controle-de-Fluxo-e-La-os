import java.util.Scanner;
public class PassouNaoPassou{
  public static void main(String[]args){
    float nota;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite sua nota de 0.0 a 10.0");
    nota = entrada.nextFloat();
    if((nota <= 10.0) && (nota>=0.0)){
      if(nota>=7.0){
        System.out.println("Parabens, voce passou direto!");
      }
      else{
        if(nota>=5.0){
          System.out.println("Vai ter que fazer recuperacao");
        }
        else{
          System.out.println("Reprovado");
        }
      }
    }
       else{
         System.out.println("Nota invalida");
       }
       }
       }
       
       
          
    }
}
