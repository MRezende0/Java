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
public class Aluno extends Pessoa {
    private String curso;
    private int termo;
    
    public Aluno() {
        
    }
    
    public Aluno(String curso, int termo, String nome, String fone, int idade) {
        super(nome, fone, idade);
        this.curso = curso;
        this.termo = termo;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getTermo() {
        return termo;
    }

    public void setTermo(int termo) {
        this.termo = termo;
    }
    
    public void passou() {
        
    }
       
}
