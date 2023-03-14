package exercicios.aula4;

import exercicios.aula4.Caes;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class PrincipalCaes {
    public static void main (String[] args){
         
         Scanner entrada = new Scanner(System.in);
         
        //cachorro1 e cachorro2 são objetos da classe Cao
        Caes cachorro1 = new Caes();
        Caes cachorro2 = new Caes();
        
        System.out.println("Informe o nome do cachorro: ");
        cachorro1.nome = entrada.nextLine();
        //cachorro1.nome = "Bob";
        
        System.out.println("Informe o peso do cachorro: ");
        cachorro1.peso = entrada.nextDouble();
        //cachorro1.peso = 10.0;
        
        entrada.nextLine();
        
        System.out.println("Informe a cor dos olhos do cachorro: ");
        cachorro1.corDosOlhos = entrada.nextLine();
        
        System.out.println("Informe a quantidade de patas do cachorro: ");
        cachorro1.quantPatas = entrada.nextInt();
        
        
        cachorro2.nome = "Mel";
        cachorro2.peso = 8.0;
        cachorro2.corDosOlhos = "verde";
        cachorro2.quantPatas = 8;
        
        System.out.println(cachorro1.nome);
        System.out.println(cachorro1.peso);
        System.out.println(cachorro1.corDosOlhos);
        System.out.println(cachorro1.quantPatas);
        
        System.out.println(cachorro2.nome);
        System.out.println(cachorro2.peso);
        System.out.println(cachorro2.corDosOlhos);
        System.out.println(cachorro2.quantPatas);
        
         System.out.println("Digite a idade do seu cachorro");
         cachorro1.idadeCaes(entrada.nextInt());
         
         for (int i = 0; i <10 ; i++){
         
             System.out.println("Daqui a " + i + " anos seu cachorro terá :" + (cachorro1.idade+i));
         }
         
         if (cachorro1.idade>5){
         
             System.out.println("Seu cachorro é adulto");
         }
         
         else{
         
             System.out.println("Seu cachorro não é adulto");
         }
    }   
}
