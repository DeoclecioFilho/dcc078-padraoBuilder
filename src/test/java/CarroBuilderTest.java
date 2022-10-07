
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {


    @Test
    void deveRetornarExcecaoParaCarroSemMotor() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Opala")
                    .setPneu("225/200")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Motor inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaModeloInvalido()  {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setMotor(450)
                    .setPneu("225/200")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarCarroValido(){
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setModelo("Opala")
                .setMotor(2)
                .setPneu("225/200")
                .build();
        assertNotNull(carro);
    }

}