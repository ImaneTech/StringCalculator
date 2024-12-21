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
    @Test
    public void return_8_pour_3_5() {
        //GIVEN
        int expectedResult =8;
        //WHEN
        int actualResult = ExpressionEvaluator.evaluate("3,5");
        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void return_22_pour_10_6_6() {
        //GIVEN
        int expectedResult =22;
        //WHEN
        int actualResult = ExpressionEvaluator.evaluate("10,6,6");
        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void return_21_pour_5_5_4_7() {
        //GIVEN
        int expectedResult =21;
        //WHEN
        int actualResult = ExpressionEvaluator.evaluate("5,5,4,7");
        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void return_20_pour_20() {
        //GIVEN
        int expectedResult =20;
        //WHEN
        int actualResult = ExpressionEvaluator.evaluate("20");
        //THEN
        assertThat(actualResult).isEqualTo(expectedResult);
    }

}
