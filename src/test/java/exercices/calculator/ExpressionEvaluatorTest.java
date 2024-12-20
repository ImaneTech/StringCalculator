package exercices.calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ExpressionEvaluatorTest {

    @Test
    public void return_0_pour_chaine_vide() {
        //GIVEN
        int expectedResult =0;
        //WHEN
        int actualResult = ExpressionEvaluator.evaluate("");
        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
