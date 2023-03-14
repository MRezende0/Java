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
public class Principal {

    public static void main(String[] args) {
        
        Cliente c = new Cliente("Matheus", "Alameda das Violeteiras, 90", "449584518-70");
        System.out.println("Nome:" + c.getNome());
        System.out.println("Endereço:" + c.getEndereco());
        System.out.println("CPF:" + c.getCpf());
        
        
        Fornecedor f = new Fornecedor("Hugo", "Visinho", "11111111-0");
        System.out.println("Nome:" + f.getNome());
        System.out.println("Endereço:" + f.getEndereco());
        System.out.println("CNPJ:" + f.getCnpj());
        
    }
    
}
