public class Bicicleta  extends Automovel implements Tarifa {


    public Bicicleta(String tipo, String placa, String tempo) {
        super(tipo, placa, tempo);
    }

    @Override
    public double tempo() {
        double valorBicicleta = 5;

        if (tempo >= 0.30){
            System.out.println("O valor em relação ao seu tempo é de: " + valorBicicleta);
        } else {
            System.out.println("Tempo inaceitavel");
        }

        return valorBicicleta;
    }

    @Override
    public double umaHora() {
        double valorBicicleta = 7;

        if (tempo == 1.00){
            System.out.println("O valor em relação ao seu tempo é de: " + valorBicicleta);
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorBicicleta;
    }

    @Override
    public double horasExtras() {
        double horaAdicional = 2;
        double valorBicicleta = 7;


        if (tempo > 1 && tempo < 7){
            System.out.println("O valor em relação ao seu tempo é de: " + valorBicicleta + 5 *(tempo - 1));
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorBicicleta;
    }

    @Override
    public double dia() {
        double valorBicicleta = 10;

        if (tempo < 7){
            System.out.println("O valor em relação ao seu tempo é de: " + valorBicicleta);
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorBicicleta;
    }
}
