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
public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
    
    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    

    @Override
    public String amamentar() {
        return "O gato mamou!";
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public void brincar() {
        System.out.println("Bolinha!");
    }

    @Override
    public void levarPassear() {
        System.out.println("Passear!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida!");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Ir ao veterinário!");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("O veterinário está vindo!");
    }
    
}
