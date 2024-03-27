package view;

import model.EstudanteSuperior;
import model.EstudanteTecnico;
import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import controller.IEstudanteController;

public class PrincipalEscola {
    public static void main(String[] args) {
        EstudanteTecnico estTecnico = new EstudanteTecnico("123", "João", "joao@email.com", 7.5f, 9);
        EstudanteSuperior estSuperior = new EstudanteSuperior("456", "Maria", "maria@email.com", 8.3f, 12,
                "Escola XYZ", 2018);

        IEstudanteController estTecnicoController = new EstudanteTecnicoController();
        IEstudanteController estSuperiorController = new EstudanteSuperiorController();

        System.out.println("Percentual de rendimento do estudante técnico: " +
                estTecnicoController.calcularPercentualRendimento(estTecnico));
        System.out.println("Percentual de progressão do estudante técnico: " +
                estTecnicoController.calcularPercentualProgressao(estTecnico));

        System.out.println("Percentual de rendimento do estudante superior: " +
                estSuperiorController.calcularPercentualRendimento(estSuperior));
        System.out.println("Percentual de progressão do estudante superior: " +
                estSuperiorController.calcularPercentualProgressao(estSuperior));
    }
}