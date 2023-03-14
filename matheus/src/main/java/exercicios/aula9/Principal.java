/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula9;

/**
 *
 * @author Matheus
 */
public class Principal {   
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(18);
        p.aniversario();
        Aluno a = new Aluno();
        Funcionario f = new Funcionario();
        f.setCargo("Estagiário");
        f.setSalario(1500);
        System.out.println("O seu cargo é " + f.getCargo() + " e o seu salário é " + f.getSalario());
        f.aumento(2200);
        System.out.println("O seu novo salário é " + f.getSalario());
        
        
    }
    
}
