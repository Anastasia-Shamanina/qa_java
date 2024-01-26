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

    @Test
    public void testGetKittens() {
        Feline mockFeline = Mockito.mock(Feline.class);
        Lion lion = new Lion(mockFeline);
        Mockito.when(mockFeline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodLion() throws Exception {
        Feline mockFeline = Mockito.mock(Feline.class);
        Lion lion = new Lion(mockFeline);
        Mockito.when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}
