package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data; // classe do java para trabalhar com datas

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }

    //construtor
    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                "descricao='" + getDescricao() + '\'' +
                "data=" + data +
                '}';
    }

}
