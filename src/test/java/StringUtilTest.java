import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testIsEmpty() {
        System.err.println("testIsEmpty");

        boolean b;

        b = StringUtil.isEmpty("abc");
        Assert.assertFalse(b);

        b = StringUtil.isEmpty(null);
        Assert.assertTrue(b);

        b = StringUtil.isEmpty("");
        Assert.assertTrue(b);
    }

    @Test
    public void testReverse() {
        System.err.println("testReverse");

        String r = StringUtil.revese("abcd");
        Assert.assertEquals("dcba", r);

        r = StringUtil.revese(null);
        Assert.assertNull(r);
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
