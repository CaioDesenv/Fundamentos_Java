
package atividades_senac;

import java.util.Scanner;

public class atividade1_1 {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner (System.in);
        
    int convidados, auditorio1, auditorio2;
    String palco1 = "Auditorio Alfa";
    String palco2 = "Auditorio Beta";
        
        System.out.println("Programa Auditorio\n");
        System.out.println("Insira o numero de convidados do seu \n"
        + "evento que nós escolhemos o melhor auditorio para você!");
        convidados = entrada.nextInt();
        
       if(convidados >0 && convidados <= 220) {
           
           if(convidados > 150) {
            System.out.println(palco1); 
            System.out.println("Este auditorio comporta todos os seu convidados");
                int convidado1 = 150;
                int guarda = 0;
                
               guarda = convidados - convidado1;
               
               System.out.println("O numero de convidados inseridos foi de: " + convidados + ""
                       + "\n você irá precisar de mais " + guarda + " cadeiras extras ");    
                
           } else {
            System.out.println(palco2); 
            System.out.println("Este auditorio comporta todos os seu convidados");
            System.out.println("O numero de convidados inseridos foi de: " + convidados + " convidados");
           }
       }if(convidados > 220 && convidados <=350){
           
           System.out.println(palco2);
           System.out.println("Este auditorio comporta todos os seu convidados");
           System.out.println("O numero de convidados inseridos foi de: " + convidados + " convidados");

       }else{
           System.out.println("Número de convidados inválido");
       }
        
        System.out.println("FIM!");
    }
       
}
