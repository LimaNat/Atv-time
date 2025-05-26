package com.example.aula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Sexo é obrigatório.")
    private String sexo;

    @NotNull(message = "Idade é obrigatória.")
    @Min(value = 0, message = "Idade não pode ser negativa.")
    private int idade;

    @NotNull(message = "Altura é obrigatório.")
    @Min(value = 0, message = "Altura não pode ser negativa.")
    private double altura;

    @NotNull(message = "Peso é obrigatório.")
    @Min(value = 0, message = "Peso não pode ser negativa.")
    private double peso;

    @NotBlank(message = "Posição é obrigatório.")
    private String posicao;

    @NotNull(message = "Número da camisa é obrigatório.")
    private int numCamisa;


    public Usuario() {
    }

    public Usuario(Long id, String nome, String sexo, int idade, double altura, double peso, String posicao, int numCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public String getPosicao() {return posicao;}
    public void setPosicao(String posicao) {this.posicao = posicao;}

    public int getNumCamisa() {return numCamisa;}
    public void setNumCamisa(int numCamisa) {this.numCamisa = numCamisa;}

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", posicao='" + posicao + '\'' +
                ", numCamisa=" + numCamisa +
                '}';
    }
}
