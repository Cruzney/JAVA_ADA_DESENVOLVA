public abstract class Veiculo implements Movivel {
    private  int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public int getVelocidade () {
        return velocidade;
    }

    public void aumentarVelocidade () {
        this.velocidade += 10;
        System.out.println ("Velocidade aumentada para " + velocidade + " km/h");
    }
}
