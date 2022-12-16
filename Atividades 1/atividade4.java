
package atividades_senac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class atividade1_4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<String> listafirst = new ArrayList<String>();
        ArrayList<String> listalast = new ArrayList<String>();

        String nome;
        

        int opcao, i;
        
	do{
        System.out.println("\tMENU");
	System.out.println("1) Cadastrar\t 2) Pesquisar\t 3) Sair");
	System.out.println("Escolha");
        opcao = entrada.nextInt();
        
            if(opcao == 1){
            
            System.out.println("Informe o 1° nome do cliente:");
            nome = entrada.next();
            listafirst.add(nome);
            System.out.println("Informe o 2° nome do cliente:");
            nome = entrada.next();
            listalast.add(nome);
                       
            }
            
                if(opcao == 2){
                System.out.println("Informe o 1° nome que deseja pesquisar:");
                nome = entrada.next();
                  

            int j = listafirst.size();
                
                  //lista.get(i).contains(nome)
                for (i = 0; i < listafirst.size(); i++)
                    
                    if(listafirst.get(i).equals(nome)){
                        
                        for (int k = 0; k < 1; k++) {
                        int y = listalast.size();

                        System.out.println(listafirst.get(i) + " " + listalast.get(i) + " Posição "+ i);
                        
                        }
                    }
                 }
                
            
        }while(opcao == 1 || opcao == 2);
      
        System.out.println("Fim do Programa!");
  
        
  }

    private static void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
 }