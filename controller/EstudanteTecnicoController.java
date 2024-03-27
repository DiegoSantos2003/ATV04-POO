package controller;

import model.EstudanteTecnico;
import model.Estudante;


public class EstudanteTecnicoController implements IEstudanteController {

    public float calcularPercentualRendimento(Estudante est) {
        return ((EstudanteTecnico) est).percentualRendimento();
    }

    public float calcularPercentualProgressao(Estudante est) {
        return ((EstudanteTecnico) est).percentualProgressao();
    }
}