package bridgeppb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MonstroBasicoTest {
    @Test
    void deveRetornarMonstroBasicoComMagiaFraca() {
        StatusBonus status = new MagiaFraca();
        MonstroBasico monstro = new MonstroBasico(2000f);
        monstro.bonus=status;
        assertEquals(2200.0f, monstro.calcularExp(), 0.01f);
    }
    @Test
    void deveRetornarMonstroBasicoComMagiaMediana() {
        StatusBonus status = new MagiaMediana();
        MonstroBasico monstro = new MonstroBasico(2000f);
        monstro.bonus=status;
        assertEquals(2400.0f, monstro.calcularExp(), 0.01f);
    }
    @Test
    void deveRetornarMonstroBasicoComMagiaPoderosa() {
        StatusBonus status = new MagiaPoderosa();
        MonstroBasico monstro = new MonstroBasico(2000f);
        monstro.bonus=status;
        assertEquals(2600.0f, monstro.calcularExp(), 0.01f);
    }
}

