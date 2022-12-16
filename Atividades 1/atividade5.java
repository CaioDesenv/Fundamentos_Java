package atividades_senac;

import java.util.Scanner;

public class atividade1_5 {
   public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           

        int l, c, quarto, andar, reservas = 0;
        
        int apartamento[][] = new int [6][5];
        
         String S = "S", s = "s", opcao;

         for (l = 0; l < 4; l++) {
             for (c = 0; c < 3; c++) {
                apartamento[l][c] = 0;
                
             }
           
             }do{ 
           
                for (l = 4; l > 0; l--) {
                
                System.out.print(l + " ° Andar ");
                for ( c = 1; c < 4; c++) {
                    

                    System.out.print("["+apartamento[l][c] + "] ");
                    
                }
                System.out.print(" " +"\n");
            }
            System.out.println("\nAndares 1 - 2 - 3 - 4");
            System.out.println("Quartos 1 - 2 - 3");
            System.out.println("Digite o quarto desejado: ");
            quarto = entrada.nextInt();
            System.out.println("Digite o andar desejado: ");
            andar = entrada.nextInt();
            if(quarto < 1 || quarto > 3){
                System.out.println("\nquarto Invalido!");
                System.out.println("Deseja continuar? S/N ");
                opcao = entrada.next();{
                if(opcao != "s" || opcao !="S"){
                    continue;
                }
            }
            }if(andar < 1 || andar > 4){
                    System.out.println("\nColunar invalida!");
                       System.out.println("Deseja continuar? S/N ");
                opcao = entrada.next();{
                if(opcao != "s" || opcao !="S"){
                    continue;
                }
            }
                }if(apartamento[quarto][andar] == 1){
                        System.out.println("\n*********Quarto indisponivel!***********");
                           System.out.println("Deseja continuar? S/N ");
                opcao = entrada.next();{
                if(opcao != "s" || opcao !="S"){
                    continue;
                }
            }
                    }else{
                        apartamento[quarto][andar] += 1;
                        System.out.println("\n*********Reservado com sucesso!********");
                        reservas++;
                           System.out.println("Deseja continuar? S/N ");
                opcao = entrada.next();{
                if(opcao != "s" || opcao !="S"){
                    continue;
                }
            }
        }
             
      }while(reservas < 12);
       System.out.println("Sem vagas no momento!");
       
    //1 ° Andar [0] [0] [0]  
    //2 ° Andar [0] [0] [0]  
    //3 ° Andar [0] [0] [0]  
    //4 ° Andar [0] [0] [0]  
    
}
}