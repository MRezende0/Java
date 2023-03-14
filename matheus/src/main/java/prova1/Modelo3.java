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
public class Modelo3 {
    public int SomaNumeros(int numero) {
        int soma = 0;
        
        for (int i = numero; i <= 100; i += 5) {
            soma += i;
        }
        return soma;
    }
}
