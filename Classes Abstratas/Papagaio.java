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
public class Papagaio extends Ave implements AnimalDomesticado {

    @Override
    public String voar() {
        return "O papagaio voou!";
    }

    @Override
    public String emitirSom() {
        return "O papagaio falou!";
    }

    @Override
    public void alimentar() {
        System.out.println("Comidaaa!");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Veterináriooooo!");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Ele está vindoooo!");
    }
    
}
