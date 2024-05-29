package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //final = constante
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    //abstract precisa de uma classe abstract.
    //abstract = conteúdo não instanciável.
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
