package abstractfactory;

public class Professor {

    private Matricula matricula;
    private CargaHoraria cargaHoraria;

    public Professor (FabricaAbstrata fabrica) {
        this.matricula = fabrica.createMatricula();
        this.cargaHoraria = fabrica.createCargaHoraria();
    }

    public String emitirMatricula() {
        return this.matricula.emitir();
    }

    public String emitirCargaHoraria() {
        return this.cargaHoraria.emitir();
    }
}