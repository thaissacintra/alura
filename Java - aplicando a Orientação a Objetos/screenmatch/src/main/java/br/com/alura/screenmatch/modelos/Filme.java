package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { // extends --> Herança
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override // implementação
    public int getClassificacao() {
        return (int) pegaMedia() / 2; // casting: Conversão de tipo "(int)"
    }
}
