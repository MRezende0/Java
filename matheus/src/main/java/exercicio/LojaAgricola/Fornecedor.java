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
public class Fornecedor extends Pessoa{
    
    public Fornecedor(){
        
    }
    
    private String cnpj;
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Fornecedor(String nome, String endereco, String cjpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }
    
}
