import java.util.Scanner;
public class PasseiOuNao {
  public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    float nota;
    System.out.println("Digite sua nota de 0.0 ate 10.0");
    nota = entrada.nextFloat();
    
    if((nota<=10.0)&&(nota>=0.0)){
      
      if(nota>=7.0){
        
        System.out.println("Parabens, voce passou");
      }
      else {
        if(nota>=5.0){
          
          System.out.println("Recuperacao");
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
