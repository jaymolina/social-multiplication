package microservices.boot.service;

import microservices.boot.socialmultiplication.domain.Multiplication;
import microservices.boot.socialmultiplication.service.MultiplicationService;
import microservices.boot.socialmultiplication.service.RandomGeneratorService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Created by javiermolinamarcilla on 29/4/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiplicationServiceTest {

    @MockBean
    private RandomGeneratorService randomGeneratorService;

    @Autowired
    private MultiplicationService multiplicationService;

    @Test
    public void createRandomMultiplicationTest(){
        //given (our mocked Random Generator service will return
        //first 50, then 30
        given(randomGeneratorService.generatedRandomFactor()).willReturn(50,30);

        //when
        Multiplication multiplication = multiplicationService.createRandomMultiplication();

        assertThat(multiplication.getFactorA()).isEqualTo(50);
        assertThat(multiplication.getFactorB()).isEqualTo(30);
        assertThat(multiplication.getResult()).isEqualTo(1500);
    }
}
