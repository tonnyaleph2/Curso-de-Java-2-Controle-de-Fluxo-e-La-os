import java.util.Scanner;
public class SwitchTest2{
  public static void main(String[]args){
    	char vogal;
    Scanner entrada = new Scanner(System.in);
    
    System.out.printf("Digite uma vogal minuscula:");
    vogal=entrada.nextLine().charAt(0);
    
    switch(vogal)
    {
      case'a':
      System.out.printf("Voce esta no caso da vogal 'a'");
      
      case'e':
      System.out.printf("Voce esta no caso da vogal 'e'");
      
      case'i':
      System.out.printf("Voce esta no caso da vogal 'i'");
      
      case'o':
      System.out.printf("Voce esta no caso da vogal 'o'");
      
      case'u':
      System.out.printf("Voce esta no caso da vogal 'u'");
      
      default:
      System.out.printf("Voce nao digitou uma vogal minuscula");
      
    }
  }
}
