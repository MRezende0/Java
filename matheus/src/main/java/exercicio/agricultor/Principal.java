/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio.agricultor;

/**
 *
 * @author Matheus
 */
public class Principal {

    public static void main(String[] args) {
        CadernoDeEnderecosAgricultor agricultor = new CadernoDeEnderecosAgricultor();
        
        agricultor.setNome("Matheus Rezende");
        System.out.println(agricultor.getNome());
        
        agricultor.setTelefone("(14)99872-1100");
        System.out.println(agricultor.getTelefone());

        agricultor.setIdade(18);
        System.out.println(agricultor.getIdade());

        agricultor.setSalario(10000);
        System.out.println(agricultor.getSalario());
        
        agricultor.setEmail("matheus_rezende0@hotmail.com");
        System.out.println(agricultor.getEmail());
        
        agricultor.setEndereço("Alameda das Violeteiras - 90 - Valle do Canaã - 17525464");
        System.out.println(agricultor.getEndereço());
    }
}
