package com.example.aula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Usuario {
    private String peso;
    private int idade;
    private String altura;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Posição é obrigatório.")
    private String posicao;

    @NotBlank(message = "Número da camisa é obrigatória.")
    private int numCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String sexo, int idade, String altura, String peso, String posicao, int numCamisa) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {this.nome = nome;}

    public @NotBlank(message = "Posição é obrigatório.") String getPosicao() {return posicao;}

    public void setPosicao(@NotBlank(message = "Posição é obrigatório.") String posicao) {
        this.posicao = posicao;
    }

    public @NotBlank(message = "Número da camisa é obrigatória.") int getNumCamisa() {return numCamisa;}

    public void setNumCamisa(@NotBlank(message = "Número da camisa é obrigatória.") int numCamisa) {this.numCamisa = numCamisa;}
}
