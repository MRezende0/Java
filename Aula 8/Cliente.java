/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.LojaAgricola;

/**
 *
 * @author Matheus
 */
public class Cliente extends Pessoa {
    public Cliente(){
    
    } 
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Cliente(String nome, String endereco, String cpf){
        super(nome, endereco);
        this.cpf = cpf;
    }
    
}
