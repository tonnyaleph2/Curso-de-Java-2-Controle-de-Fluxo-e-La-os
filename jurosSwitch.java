import java.util.Scanner;
public class jurosSwitch{
  public static void main(String[]args){
    float valor_i,valor_f,juros=0;
    int meses;
    Scanner entrada = new Scanner(System.in);
    
    System.out.printf("Qual e o valor da divida?");
    valor_i = entrada.nextFloat();
    
    System.out.printf("Voce vai atrasar quantos meses? [0-5]?");
    meses = entrada.nextInt();
    
    switch(meses)
    {
      case 5:
      juros++;
      
      case 4:
      juros++;
      
      case 3:
      juros++;
      
      case 2:
      juros++;
      
      case 1:
      juros++;
      break;
      
      default:
      System.out.printf("Voce nao digitou um valor valido de meses.");
      
    }
    System.out.println("Juros:"+juros+"%");
    
    valor_f=((1+(juros/100))*valor_i);
    System.out.printf("O valor final da divida e R$ %.2f",valor_f);
    
  }
}

    
