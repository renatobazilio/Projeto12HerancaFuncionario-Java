/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Funcionario {
    
    //inicialmente os ATR serão Private
    //mudar os modificadores doa atributos
    //para PROTECTED de modo que esses atributos
    //da classe funcionario (PAI) tenham
    //visibilidade dentro da hierarquia de Herança
    //na classe Gerente
    protected String nome;
    protected double salario;
    protected String cpf;
    
    //contrutores e getters e setters

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getinformacao(){
        return "funcionario: " + this.nome+
                " recebe " + this.salario;
    }
    
    public double getBonificaao(){
        return this.salario * 0.10;
    }
    
    
    
}
