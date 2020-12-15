import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void  testReverse() {

        System.err.println("testReverse");

        Integer[] numbers = { 1, 2, 3, 4 , 5 };

        ArrayUtil.reverse(numbers);

        Integer[] expected = { 5, 4, 3, 2, 1 };

        Assert.assertArrayEquals(expected, numbers);
    }

    @Before
    public void before() {
        System.out.println("Iniciando testes");
    }

    @After
    public void after() {
        System.out.println("Teste finlizado");
    }
}
