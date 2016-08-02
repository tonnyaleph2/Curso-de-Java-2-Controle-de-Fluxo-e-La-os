import java.util.Scanner;
public class SwitchTest2{
  public static void main(String[]args){
    	char vogal;
    Scanner entrada = new Scanner(System.in);
    
    System.out.printf("Digite uma vogal minuscula:");
    vogal=entrada.nextLine().charAt(0);
    
    switch(vogal)
    {
      case'a': case'A':
      System.out.printf("Voce esta no caso da vogal 'a'");
      break;
      
      case'e': case'E':
      System.out.printf("Voce esta no caso da vogal 'e'");
      break;
      
      case'i': case'I':
      System.out.printf("Voce esta no caso da vogal 'i'");
      break;
      
      case'o':case'O':
      System.out.printf("Voce esta no caso da vogal 'o'");
      break;
      
      case'u':case'U':
      System.out.printf("Voce esta no caso da vogal 'u'");
      break;
      
      default:
      System.out.printf("Voce nao digitou uma vogal minuscula");
      
    }
  }
}
