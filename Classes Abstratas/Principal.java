/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classses_abstratas;

/**
 *
 * @author Matheus
 */
public class Principal {

    public static void main(String[] args) {
        
        Papagaio p = new Papagaio();
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        Cavalo cavalo1 = new Cavalo();
        
        System.out.println(p.emitirSom());
        System.out.println(c.emitirSom());
        System.out.println(g.emitirSom());
        
        c.setRaça("Raça do cachorro: Vira-Lata");
        g.setRaça("Raça do gato: Indefinida");
        
        System.out.println(c.getRaça());
        System.out.println(g.getRaça());
        
        System.out.println(cavalo1.amamentar());
        System.out.println(cavalo1.emitirSom());
        
        System.out.println(cavalo1.emitirSom());
        
    }
    
}
