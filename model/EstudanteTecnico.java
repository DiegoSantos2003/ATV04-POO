package model;

public class EstudanteTecnico extends Estudante {
    public EstudanteTecnico(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
    }

    public float percentualRendimento() {
        return getMediaNotas() * getQtdAprovacoes() * 0.931f;
    }

    public float percentualProgressao() {
        return getQtdAprovacoes() / 3.0f;
    }
}