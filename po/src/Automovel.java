public class Automovel {

    private String tipo;
    private String placa;
    private String tempo;

    public Automovel(String tipo, String placa, String tempo) {
        this.tipo = tipo;
        this.placa = placa;
        this.tempo = tempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", tempo='" + tempo + '\'' +
                '}';
    }
}
