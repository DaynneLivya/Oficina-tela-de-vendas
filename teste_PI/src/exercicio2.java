import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner oficina=new Scanner (System.in);

		int codigo_depeça01, num_depeca01, codigo_depeca02, numerodepeca02;
		Locale.setDefault(Locale.US);
		double valorpeca01, valorpeça02, pagar;
				
				codigo_depeça01= oficina.nextInt();
		        num_depeca01= oficina.nextInt();
		        valorpeca01= oficina.nextDouble();
		        codigo_depeca02= oficina.nextInt();
		        numerodepeca02=oficina.nextInt();
		        valorpeça02= oficina.nextDouble();
		        
		        pagar= valorpeca01+valorpeça02;
		        
		        
		       
		        System.out.printf("Valor a pagar: %.2f%n",pagar);
		
		
		oficina.close();
		
		
		
	}

}
