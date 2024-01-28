import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // указали, что тесты будет запускать раннер Parameterized
public class TestLionWithParameters {

    private String sex;
    private boolean expected;

    public TestLionWithParameters(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getInfo() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(expected, lion.doesHaveMane());
    }

    @Test(expected = Exception.class) // проверяем исключение
    public void otherSex() throws Exception{
        new Lion ("Иное");
    }
}


