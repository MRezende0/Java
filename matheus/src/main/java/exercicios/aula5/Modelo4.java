/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula5;

/**
 *
 * @author mathe
 */
public class Modelo4 {
    public void trocaNumero(int numA, int numB) {
        
        System.out.println("Variavel A: " + numA + " ---- Variavel B: " + numB);
        int aux;
        aux = numA;
        numA = numB;
        numB = aux;
        
        System.out.println("Variavel A: " + numA + " ---- Variavel B:" + numB);
        
    }
}
