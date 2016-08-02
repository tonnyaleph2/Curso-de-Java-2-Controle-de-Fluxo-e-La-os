public class breaktest {
  
  public static void main(String[]args){
    long i = System.currentTimeMillis();
    boolean imprimir = true;
    
    for(int count=1 ; count<=1000000 ; count++){
      if((count %17 == 0) && (count %19 == 0))
        if(imprimir){
        System.out.println(count);
        break;
      }
    }
    System.out.println("Tempo e execucao, em milisegundos:" + (System.currentTimeMillis() -i));
    
  }
}
