package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonstroTesteTest {
    @Test
    void deveRetornarMonstroTesteComMagiaFraca() {
        StatusBonus status = new MagiaFraca();
        MonstroTeste monstro = new MonstroTeste();
        monstro.bonus=status;
        assertEquals(0.0f, monstro.calcularExp(), 0.01f);
    }
    @Test
    void deveRetornarMonstroTesteComMagiaMediana() {
        StatusBonus status = new MagiaMediana();
        MonstroTeste monstro = new MonstroTeste();
        monstro.bonus=status;
        assertEquals(0.0f, monstro.calcularExp(), 0.01f);
    }
    @Test
    void deveRetornarMonstroTesteComMagiaPoderosa() {
        StatusBonus status = new MagiaPoderosa();
        MonstroTeste monstro = new MonstroTeste();
        monstro.bonus=status;
        assertEquals(0.0f, monstro.calcularExp(), 0.01f);
    }
}
