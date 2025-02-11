public class Moto extends Estacionamento{

    private double valorMoto;

    public Moto(double tempo, String automovel, double valorMoto) {
        super(tempo, automovel);
        this.valorMoto = valorMoto;
    }

    public double getValorMoto() {
        return valorMoto;
    }

    public void setValorMoto(double valorMoto) {
        this.valorMoto = valorMoto;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "valorMoto=" + valorMoto +
                '}';
    }
}
