package bridge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MonstroChefeTest {
    @Test
    void deveRetornarMonstroChefeComMagiaFraca() {
        StatusBonus status = new MagiaFraca();
        MonstroChefe monstro = new MonstroChefe(2000f);
        monstro.bonus=status;
        assertEquals(2400.0f, monstro.calcularExp(), 0.01f);
    }
    @Test
    void deveRetornarMonstroChefeComMagiaMediana() {
        StatusBonus status = new MagiaMediana();
        MonstroChefe monstro = new MonstroChefe(2000f);
        monstro.bonus=status;
        assertEquals(2800.0f, monstro.calcularExp(), 0.01f);
    }
    @Test
    void deveRetornarMonstroChefeComMagiaPoderosa() {
        StatusBonus status = new MagiaPoderosa();
        MonstroChefe monstro = new MonstroChefe(2000f);
        monstro.bonus=status;
        assertEquals(3200.0f, monstro.calcularExp(), 0.01f);
    }
}
