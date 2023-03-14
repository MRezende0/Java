/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Modelo {
    public int somaImpar()
    {
       
        int impar = 0;
        
        for(int i=1; i<=6; i+=2)
            
        {
            impar += i;
        }
            
        return impar;
    }
    
    
    
    
    public void multImpar ()
    {
        
        int impar = 0;
        long par = 1;
    
        for (int i = 1; i <= 30; i++)
        {
            
            if (i%2 == 0) 
            { 
            par *=i;
            }
            
            else
            {
                impar += i;
            }
            
            
        }
        System.out.println(par);
        System.out.println(impar);
        
    }
}
