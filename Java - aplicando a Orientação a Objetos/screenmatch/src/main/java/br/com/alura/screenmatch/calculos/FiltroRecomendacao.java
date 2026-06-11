package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            IO.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            IO.println("Muito bem avaliado no momento!");
        } else {
            IO.println("Coloque na sua lista para assistir depois");
        }
    }
}
