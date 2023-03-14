/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

/**
 *
 * @author Matheus
 */
public class Modelo1 {
    public void MaiorNumero(int num1, int num2, int num3) {
        
       if ((num1 > num2) && (num2 > num3)){
           System.out.println(num1);
       }
       else if ((num1 > num3) && (num3 > num2)){
           System.out.println(num1);
       }
       else if ((num2 > num3) && (num3 > num1)){
           System.out.println(num2);
       }
       else if ((num2 > num1) && (num1 > num3)){
           System.out.println(num2);
       }
       else if ((num3 > num1) && (num1 > num2)){
           System.out.println(num3);
       }
       else if ((num3 > num2) && (num2 > num1)){
           System.out.println(num3);
       }
    } 
}