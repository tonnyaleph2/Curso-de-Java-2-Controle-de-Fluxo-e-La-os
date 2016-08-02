import java.util.Scanner;

public class SwitchTest{
  public static void main(String[]args){
    
    float num1,num2;
    char operacao;
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Escolha a operacao que deseja efetuar [ + , - , * , /]:");
    operacao = entrada.nextLine().charAt(0);
    
    System.out.println("Entre com o primeiro numero:");
    num1=entrada.nextFloat();
    
    System.out.println("Entre com o segundo numero:");
    num2=entrada.nextFloat();
    
    System.out.println();
    
    switch (operacao)
    {
      case'+':
      System.out.printf("%.2f + %.2f = %.2f",num1,num2,num1+num2);
      break;
      
      case'-':
      System.out.printf("%.2f - %.2f = %.2f",num1,num2,num1-num2);
      break;
      
      case'*':
      System.out.printf("%.2f * %.2f = %.2f",num1,num2,num1*num2);
      break;
      
      case '/':
      System.out.printf("%.2f / %.2f = %.2f",num1,num2,num1/num2);
      break;
      
      default:
      System.out.printf("Voce digitou uma operacao invalida");
      
    }
  }
}
