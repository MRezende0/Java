/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class Principal2 {

    public static void main(String[] args) {
        Modelo2 nc = new Modelo2();
        Scanner s = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        nc.NumeroCrescente(s.nextInt());
    }
    
}
