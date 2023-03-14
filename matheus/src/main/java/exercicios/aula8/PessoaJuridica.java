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
public class PessoaJuridica extends Pessoa{
    
    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica() {
        
    }
    
    private String cnpj;
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String validacao() {
        if (cnpj.length() == 14) {
            return this.cnpj;
            
        }
        return "Inválido!";
    }
    
}
