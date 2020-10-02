import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

        private Operacoes calculadora;
        public float n1;
        public float n2;
        public double result;

        @Before
        public void initTest() {
            calculadora = new Operacoes();
            n1 = 10;
            n2 = 2;
        }

        @After
        public void afterTest(){
            calculadora = null;
        }

        @Test
        public void testAddittion() {
            result = calculadora.soma(n1, n2);
            assertEquals(12, result, 0.0001);
        }

        @Test
        public void testSubtraition(){
            result = calculadora.subtrai(n1, n2);
            assertEquals(8, result, 0.0001);
        }

        @Test
        public void testMultiplication() {
            result = calculadora.multiplica(n1, n2);
            assertEquals(20, result, 0.0001);
        }

        @Test
        public void testDivition() {
            result = calculadora.divide(n1, n2);
            assertEquals(5, result, 0.0001);
        }
    }
