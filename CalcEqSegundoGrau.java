import java.util.Scanner;
public class Bhaskara {
  public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    float a,b,c, //coeficientes
    delta, //delta
    sqrtdelta,//raiz quadrada de delta
    raiz1,raiz2;//raizes
    
    // 1 - Recebendo os coeficientes
    
    System.out.println("Digite o coeficiente a :");
    a=entrada.nextFloat();
    System.out.println("Digite o coeficiente b :");
    b=entrada.nextFloat();
    System.out.println("Digite o coeficiente c :");
    c=entrada.nextFloat();
    
    //2 - Verificar se equacao e verdadeira
    if(a != 0){
      
      //3 - Recebendo o valor de delta e calculando a raiz quadrada
      
      delta = ((b*b)-(4*a*c));
      sqrtdelta = (float)Math.sqrt(delta);
      
      // 4 - Se a raiz de delta for maior que zero, as raizes sao reais
      if(delta>= 0){
        raiz1=((-1)*b + sqrtdelta)/(2*a);
        raiz2=((-1)*b + sqrtdelta)/(2*a);
        
        System.out.printf("Raizes : %.2f e %.2f", raiz1,raiz2);
      }
      // 5 - Se a raiz de delta for menor que zero, entao as raizes serao complexas
      
      else{
        delta=-delta;
        sqrtdelta=(float)Math.sqrt(delta);
        
        System.out.printf("Raiz 1 : %.2f + i.%.2f\n",(-b)/(2*a),(sqrtdelta)/(2*a));
        System.out.printf("Raiz 2 : %.2f + i.%.2f\n",(-b)/(2*a),(sqrtdelta)/(2*a));
      }
    }
    else{
      System.out.printf("Nao e uma equacao do segundo grau");
    }
  }
}

          
        
    
