package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermissaoTest {

    MembroDono dono;
    MembroAdministrador administrador;
    MembroModerador moderador;
    MembroComum membro;

    @BeforeEach
    void setUp() {
        dono = new MembroDono(null);
        administrador = new MembroAdministrador(dono);
        moderador = new MembroModerador(administrador);
        membro = new MembroComum(moderador);
    }

    @Test
    void deveRetornarMembroParaBloquear() {
        assertEquals("Membro", membro.aplicarPermissao(new Permissao(TipoPermissaoBloquear.getTipoPermissaoBloquear())));
    }

    @Test
    void deveRetornarMembroParaSilenciar() {
        assertEquals("Moderador", membro.aplicarPermissao(new Permissao(TipoPermissaoSilenciar.getTipoPermissaoSilenciar())));
    }

    @Test
    void deveRetornarMembroParaExpulsar() {
        assertEquals("Administrador", membro.aplicarPermissao(new Permissao(TipoPermissaoExpulsar.getTipoPermissaoExpulsar())));
    }

    @Test
    void deveRetornarMembroParaBanir() {
        assertEquals("Administrador", membro.aplicarPermissao(new Permissao(TipoPermissaoBanir.getTipoPermissaoBanir())));
    }

    @Test
    void deveRetornarMembroParaExcluirServidor() {
        assertEquals("Dono", membro.aplicarPermissao(new Permissao(TipoPermissaoExcluirServidor.getTipoPermissaoExcluirServidor())));
    }

    @Test
    void deveRetornarPermissãoDispensadaParaIgnorar() {
        assertEquals("Permissão dispensada", membro.aplicarPermissao(new Permissao(TipoPermissaoIgnorar.getTipoPermissaoIgnorar())));
    }
}