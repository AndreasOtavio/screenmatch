package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {

        return (int)pegaMedia() / 2;
    }

    private String diretor;

    public String getDiretor() {

        return diretor;
    }

    public void setDiretor(String diretor) {

        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " - (" + this.getAnoDelancamento() + ")";
    }
}