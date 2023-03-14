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
public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
    
    private String tamanho;
    private String raça;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    
    @Override
    public String amamentar() {
        return "O cachorro mamou!";
    }

    @Override
    public String emitirSom() {
        return "Au Au!";
    }

    @Override
    public void brincar() {
        System.out.println("Ossinho!");
    }

    @Override
    public void levarPassear() {
        System.out.println("Vamos passear!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comida!");
    }

    @Override
    public void levarVeterinario() {
        System.out.println("Vamos ao veterinário!");
    }

    @Override
    public void chamarVeterinario() {
        System.out.println("O veterinário está vindo!");
    }
    
}
