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
public class Cavalo extends Mamifero implements AnimalDomesticado{

    @Override
    public String amamentar() {
        return "O cavalo mamou!";
    }

    @Override
    public String emitirSom() {
        return "Pocotó Pocotó!";
    }

    @Override
    public void alimentar() {
        System.out.println("O cavalo comeu!");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("O cavalo foi ao veterinário!");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("O veterinário foi ver o cavalo!");
    }
    
    
    
}
