package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    // atributos encapsulados!
    private String titulo;
    private String descricao;
    private LocalDate data; // classe do java para trabalhar com datas

    //construtor
    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
