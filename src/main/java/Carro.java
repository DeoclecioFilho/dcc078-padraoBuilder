import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {

    private String modelo;
    private int motor;
    private String seguranca;
    private String tecnologia;
    private String pneu;
    private String cilindradas;

    public Carro(){
        this.modelo = "";
        this.motor = 0;
    }


}
