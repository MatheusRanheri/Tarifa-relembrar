public class Carro extends Automovel implements Tarifa {


    public Carro(String tipo, String placa, String tempo) {
        super(tipo, placa, tempo);
    }

    @Override
    public double minuto() {
        double valorCarro = 10;

        if (tempo >= 0.30){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro);
        } else {
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

    @Override
    public double umaHora() {
        double valorCarro = 15;

        if (tempo == 1.00){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro);
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

    @Override
    public double horasExtras() {
        double horaAdicional = 5;
        double valorCarro = 15;


        if (tempo > 1 && tempo < 7){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro + 5 *(tempo - 1));
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

    @Override
    public double dia() {
        double valorCarro = 30;

        if (tempo < 7){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro);
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }


}
