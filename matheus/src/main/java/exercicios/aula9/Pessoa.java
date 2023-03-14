package exercicios.aula9;

import java.time.LocalDate;

public class Pessoa {
    
    private String nome;
    private String fone;
    private int idade;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String fone, int idade) {
        this.nome = nome;
        this.fone = fone;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome; 
    }
    
    public String getFone() {
        return fone;
    }
    
    public void setFone(String fone) {
        this.fone = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void aniversario() {
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        int nascimento = ano - this.idade;
        System.out.println("O ano de nascimento é: " + nascimento);
    }
    
    public void novo_fone(String f) {
        setFone(f);
    }
   
}
    


