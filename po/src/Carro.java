public class Carro extends Estacionamento{


    public Carro(double tempo, String automovel) {
        super(tempo, automovel);
    }

    public double meiaHoraCarro(double tempo){
       double valorCarro = 10;

        if (tempo >= 0.30){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro);
        } else {
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

    public double umaHoraCarro(double tempo){
        double valorCarro = 15;

        if (tempo == 1.00){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro);
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

    public double seisHorasMais(double tempo){
        double horaAdicional = 5;
        double valorCarro = 15;


        if (tempo > 1 && tempo < 7){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro + 5 *(tempo - 1));
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

    public double Dia(double tempo){
       double valorCarro = 30;

        if (tempo < 7){
            System.out.println("O valor em relação ao seu tempo é de: " + valorCarro);
        }else{
            System.out.println("Tempo inaceitavel");
        }

        return valorCarro;
    }

}
