package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            IO.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
        } else {
            IO.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }
}
