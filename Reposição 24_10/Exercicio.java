/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicao_24_10;

/**
 *
 * @author Matheus
 */
public class Exercicio {
    public void exercicio_um() {
        for(int cont = 1; cont < 101; cont++) {
            System.out.println("A raiz quadrada de " + cont + "é: " + Math.sqrt(cont));
        }
    }
    
    public void exercicio_dois() {
        for(int cont = 0; cont < 101; cont++) {
            System.out.println("O numero é: " + cont + " e o seu binário é: " + Integer.toBinaryString(cont));
        }
    }
    
    public long exercicio_tres(String binario) {
        return Integer.parseInt(binario, 10);
                
    }
    
}
