public class pa { 
    public static void main(String[] args) { 
        int inicial=1, 
            razao=3, 
            an=inicial, 
                valor_max=20; 
         
        System.out.printf("Elementos da PA, de valor inicial %d e razao %d, menores que %d\n", inicial, razao, valor_max ); 
        while(an<=valor_max){ 
            System.out.println(an); 
            an += razao; 
        } 
    } 

}
