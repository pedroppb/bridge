package bridgeppb;

public class MonstroChefe extends TipoMonstro {
    public MonstroChefe(float exp) {
        super(exp);
    }

    @Override
    public float calcularExp() {
        return this.experiencia*(1+(this.bonus.getMultiplicadorBonus()*2));
    }
}
