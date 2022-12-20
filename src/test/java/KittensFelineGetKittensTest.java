
import com.example.Feline;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class KittensGetKittensTest {
    private final int expectedResult;
    private final int kittensQuantity;


    Feline feline = new Feline();

    public KittensGetKittensTest(int kittensQuantity, int expectedResult) {
        this.expectedResult = expectedResult;
        this.kittensQuantity = kittensQuantity;

    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {2, 2},
                {8, 8},
                {4, 4},
        };
    }

    @Test
    public void kittensQuantityTest() {
        assertEquals(expectedResult, feline.getKittens(kittensQuantity));
    }
}
