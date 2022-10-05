
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {


    @Test
    void deveRetornarExcecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setModelo("Opala")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Motor inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMotorInvalido()  {
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

/*    @Test
    void deveRetornarAlunoValido() {
        AlunoBuilder alunoBuilder = new AlunoBuilder();
        Aluno aluno = alunoBuilder
                .setMatricula(1)
                .setNome("Aluno 1")
                .setEmail("aluno1@email.com")
                .build();

        assertNotNull(aluno);
    }*/

}