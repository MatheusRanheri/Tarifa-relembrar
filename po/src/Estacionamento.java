public class Estacionamento {

    private String automovel;
    private double tempo;

    public Estacionamento(){

    }

    public Estacionamento(double tempo, String automovel){
        this.tempo = tempo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public String getAutomovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }

    @Override
    public String toString() {
        return "Estacionamento{" +
                "automovel='" + automovel + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
