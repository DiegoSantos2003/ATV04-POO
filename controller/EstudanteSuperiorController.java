package controller;

import model.Estudante;
import model.EstudanteSuperior;


public class EstudanteSuperiorController implements IEstudanteController {
    @Override
    public float calcularPercentualRendimento(Estudante est) {
        return ((EstudanteSuperior) est).percentualRendimento();
    }

    @Override
    public float calcularPercentualProgressao(Estudante est) {
        return ((EstudanteSuperior) est).percentualProgressao();
    }
}