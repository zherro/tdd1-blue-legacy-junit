import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ArrayUtilTest.class, StringUtilTest.class})
public class MySuite {



    // não funciona aqui
    @Before
    public void before() {
        System.err.println("++++++++++++++++++++++++++++++++++++++");
        System.err.println("Iniciando testes");
        System.err.println("++++++++++++++++++++++++++++++++++++++");
    }

    // não funciona aqui
    @After
    public void after() {
        System.err.println("++++++++++++++++++++++++++++++++++++++");
        System.err.println("Teste finlizado");
        System.err.println("++++++++++++++++++++++++++++++++++++++");
    }
}
