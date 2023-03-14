/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcato
 */
public class Modelo5 
{
    
    public void comparaNum(int numA, int numB) {
        
        System.out.println("Variavel A: " + numA + " ---- Variavel B: " + numB);
        
        if (numA > numB)
        {
            System.out.println("Variavel A: " + numA +" é maior que Variavel B: "+numB);
        }
        
        else if(numB > numA)
        {
            System.out.println("Variavel B: " + numB +" é maior que Variavel A: "+numA);
        }
        
        else
        {
            System.out.println("Variavel A: " + numA +" é igual Variavel B: "+numB);
        }
        
    }
    
}
