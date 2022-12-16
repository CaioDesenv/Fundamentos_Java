package atividades_senac;

import java.util.Scanner;

public class atividade1_3 {
      public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    int idade = 0, contMenor = 0, contSenior = 0, contDiaria = 0;
    String nome;
    String continuar = "S";
    double diaria = 0.0, valor1 = 0.0, valor2 = 0.0, valor3 = 0.0, valor4 = 0.0, valor = 0.0;
    
        System.out.println("*** | Bem Vindo ao Hotel JAVALI | ***");
        System.out.println("Insira o valor da diaria!");
        diaria = entrada.nextFloat();
        
        if(diaria < 1)
            System.out.println("Valor ínvalido");
                while(diaria < 1){
                    System.out.println("Insira o valor da diaria!");
                     diaria = entrada.nextFloat();

                }while(continuar.equals("S")){
                    System.out.println("Por favor insira um nome: ");
                    nome = entrada.next();
                    if(nome == ""){
                        System.out.println("Por favor insira seu nome: ");
                        nome = entrada.next();

                    } System.out.println("Insira a idade de " + nome);
                       idade = entrada.nextInt();
                       if(idade <= 0){
                           System.out.println("Idade ínvalida!");
                       }while(idade <= 0){
                           System.out.println("Insira a idade de " + nome);
                           idade = entrada.nextInt();
                       }if(idade > 0 && idade < 4){
                           System.out.println("Opa!! " + nome + "possuí gratuidade!");
                           contMenor += 1; 
                       }if(idade > 80){
                           System.out.println(nome + " paga meia");
                           contSenior += 1;
                       }if(idade >= 5 || idade < 80){
                           contDiaria +=1;
                       }System.out.println("Deseja continuar --> 'S' deseja parar --> 'PARE'");
                       continuar = entrada.next();
                             
        }
                valor1 = contDiaria * diaria;
                valor2 = contSenior * diaria;
                valor3 = valor2 * 0.5;
                valor4 = contMenor * diaria;
                valor =  valor1 - valor3 - valor4;
                System.out.println("gratuidade 's " + contMenor);
                System.out.println("meia 's " + contSenior);
                System.out.println("Total de hospedagem " + valor + " $");
      }
}
