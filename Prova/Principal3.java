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
public class Principal3 {
    public static void main(String args[]) {
        Modelo3 numeros = new Modelo3();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        System.out.println(numeros.SomaNumeros(entrada.nextInt()));         
    }
}
