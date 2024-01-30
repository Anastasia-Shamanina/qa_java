import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestLion {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    int numberOfKittens = 1;
    private String sex = "Самка";
    private String type = "Хищник";
    @Test
    public void testGetKittens() throws Exception{
        Feline mockFeline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex,mockFeline);
        Mockito.when(mockFeline.getKittens()).thenReturn(numberOfKittens);
        assertEquals(numberOfKittens, lion.getKittens());
    }

    @Test
    public void testGetFoodLion() throws Exception {
        Feline mockFeline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, mockFeline);
        Mockito.when(mockFeline.getFood(type)).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
