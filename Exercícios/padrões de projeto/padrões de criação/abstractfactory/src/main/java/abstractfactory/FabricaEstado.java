package abstractfactory;

public class FabricaEstado implements FabricaAbstrata {

    @Override
    public Matricula createMatricula() {
        return new MatriculaEstado();
    }

    @Override
    public CargaHoraria createCargaHoraria() {
        return new CargaHorariaEstado();
    }
}