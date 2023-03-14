/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula8;

/**
 *
 * @author Matheus
 */
public class PessoaFisica extends Pessoa{
    private long cpf;
    
    public long getCpf() {
        return cpf;
    }
    
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    public String validacao() {
        if(String.valueOf(cpf).toString().length() == 11) { 
            return String.valueOf(cpf);
            
        }
        
        return "Numero insuficiente!";
    }
}
