
import java.util.Scanner; 
public class lab1 {
public static void main(String[]args){
		
		final int N�MEROS_A_LER=3;
	    Scanner sc= new Scanner(System.in);
	    int minimo= Integer.MAX_VALUE;
	    int maximo= Integer.MIN_VALUE;
	    
	    for(int i= 0; i<N�MEROS_A_LER; i++) {
	    	System.out.println("Entre com o pr�ximo n�mero inteiro");
	    	int num = sc.nextInt();
	    	if(num<minimo) {
	    		minimo = num;
	    	}
	    	if (num > maximo){
	    		maximo = num;
	    	
	    }
	    	
	   
	         

	    }	
	    System.out.println("o maior n�mero �:"+maximo);
        System.out.println("o menor n�mero �:"+minimo);
}
	
	}