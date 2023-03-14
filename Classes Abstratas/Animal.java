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
public abstract class Animal {
    
    private String nome;
    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
}
