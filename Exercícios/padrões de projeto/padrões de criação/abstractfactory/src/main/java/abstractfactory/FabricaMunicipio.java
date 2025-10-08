package abstractfactory;

public class FabricaMunicipio implements FabricaAbstrata {

    @Override
    public Matricula createMatricula() {
        return new MatriculaMunicipio();
    }

    @Override
    public CargaHoraria createCargaHoraria() {
        return new CargaHorariaMunicipio();
    }
}