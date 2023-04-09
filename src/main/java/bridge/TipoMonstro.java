package bridge;

public abstract class TipoMonstro {
    protected StatusBonus bonus;
    protected float experiencia;

    public TipoMonstro(float exp){
        experiencia=exp;
    }

    public void setBonus(StatusBonus bonus) {
        this.bonus = bonus;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    public abstract float calcularExp();
}
