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
public class Funcionario extends Pessoa{
    private String cargo;
    private float salario;
    
    public Funcionario() {
        
    }
    
    public Funcionario(String cargo, float salario, String nome, String fone, int idade) {
        super(nome, fone, idade);
        this.cargo = cargo;
        this.salario = salario;
        
    }
        
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumento(float novo_salario) {
        setSalario(novo_salario);
    }
        
} 
