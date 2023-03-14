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
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa pf = new PessoaFisica();
        Pessoa pj = new PessoaJuridica();
        PessoaJuridica j = new PessoaJuridica();
        PessoaFisica p1 = new PessoaFisica();
        j.setCnpj("11111111111111");
        p1.setCpf(44958451870L);
        
        System.out.println(j.validacao());
        System.out.println(p1.validacao());
    }
    
}
