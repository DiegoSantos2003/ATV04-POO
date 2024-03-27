package controller;

import model.Estudante;

public interface IEstudanteController {
    float calcularPercentualRendimento(Estudante est);
    float calcularPercentualProgressao(Estudante est);
}
