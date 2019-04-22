import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RedPencilTest {

    @Test
    public void priceShouldBeStableForThirtyDaysBeforePriceChange() {
        RedPencil redPencil = new RedPencil(100);

        double actual = redPencil.calculatePrice(10);

        double expected = 100;

        assertThat(actual, is(expected));

    }
}
