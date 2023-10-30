import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlourPackerTest {

    @Test
    void getEffectiveBigBagCount() {

        int maxBigBags3 = 10 / 5;

        assertEquals(2, Math.min(3, maxBigBags3));

        int maxBigBags2 = 25 / 5;

        assertEquals(2, Math.min(2, maxBigBags2));

        int maxBigBags1 = 12 / 5;

        assertEquals(0, Math.min(0, maxBigBags1));

        int maxBigBags = 5 / 5;

        assertEquals(1, Math.min(1, maxBigBags));

    }

    @Test
    void canPack() {

        assertTrue(FlourPacker.canPack(5, 10, 15));



    }
}