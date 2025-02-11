public class Bicicleta  extends Estacionamento{

    private double valorBicicleta;

    public Bicicleta(double tempo, String automovel, double valorBicicleta) {
        super(tempo, automovel);
        this.valorBicicleta = valorBicicleta;
    }

    public double getValorBicicleta() {
        return valorBicicleta;
    }

    public void setValorBicicleta(double valorBicicleta) {
        this.valorBicicleta = valorBicicleta;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "valorBicicleta=" + valorBicicleta +
                '}';
    }
}
