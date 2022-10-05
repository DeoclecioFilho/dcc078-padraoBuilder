public class CarroBuilder {


    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getMotor() == 0) {
            throw new IllegalArgumentException("Motor inválido");
        }
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        return carro;
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setMotor(int motor) {
        carro.setMotor(motor);
        return this;
    }

    public CarroBuilder setPneu(String pneu) {
        carro.setPneu(pneu);
        return this;
    }


}
