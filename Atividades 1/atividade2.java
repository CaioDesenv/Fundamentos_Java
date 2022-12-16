package atividades_senac;
import java.util.Scanner;
public class atividade1_2 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
		String cliente1, cliente2;
		int idade1, idade2;


		System.out.println("Digire o nome do 1° cliente: ");
                cliente1 =  entrada.next();
                
		System.out.println("Digite a idade de " + cliente1);
		idade1 = entrada.nextInt();

	        System.out.println("Digire o nome do 2° cliente:");
                cliente2 = entrada.next();

		System.out.println("Digite a idade de " + cliente2);
		idade2 = entrada.nextInt();

		if(idade1 > idade2){
			System.out.println("Quarto A: " + cliente1 + " com desconto de 40%\n");
			System.out.println("Quarto B: " + cliente2);
		}else{
			System.out.println("Quarto A: " + cliente2 + " com desconto de 40%\n");
			System.out.println("Quarto B: " + cliente1);
		}
	
	}
}

        
      
    
      
