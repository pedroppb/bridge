package bridgeppb;

public class MonstroBasico extends TipoMonstro{
    public MonstroBasico(float exp) {
        super(exp);
    }

    @Override
    public float calcularExp() {
        return this.experiencia*(1+this.bonus.getMultiplicadorBonus());
    }
}
