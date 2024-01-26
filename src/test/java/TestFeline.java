import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class TestFeline {

    @Test
    public void testEatMeat() throws Exception{
        Feline feline = new Feline(); //можно вынести в бефо
        assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        assertEquals("Кошачьи",feline.getFamily());
    }

}
