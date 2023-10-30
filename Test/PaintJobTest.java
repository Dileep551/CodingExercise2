import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintJobTest {

    @Test
    void getBucketCount() {
        //Given
        var num1 = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        var num2 = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        var num3 = PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);

        //When


        //Then
        assertEquals(3, num1);
        assertEquals(-1, num2);
        assertEquals(3, num3);

    }

    @Test
    void testGetBucketCount() {

        //Given
        var num1 = PaintJob.getBucketCount(3.4, 2.1, 1.5);
        var num2 = PaintJob.getBucketCount(-3.4, 2.1, 1.5);
        var num3 = PaintJob.getBucketCount(7.25, 4.3, 2.35);

        //When

        //Then
        assertEquals(5, num1);
        assertEquals(-1, num2);
        assertEquals(14, num3);

    }

    @Test
    void testGetBucketCount1() {

        //Given
        var num1 = PaintJob.getBucketCount(3.4, 1.5);
        var num2 = PaintJob.getBucketCount(6.26, 2.2);
        var num3 = PaintJob.getBucketCount(3.26, 0.75);

        //When

        //Then
        assertEquals(3, num1);
        assertEquals(3, num2);
        assertEquals(5, num3);

    }
}