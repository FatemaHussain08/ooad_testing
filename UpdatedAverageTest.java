//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

// import java.beans.Transient;

import org.junit.Test;


public class UpdatedAverageTest {
    @Test
    public void averageTest(){
        UpdatedAverage a = new UpdatedAverage();
        int[] empty_list = new int[0];
        int[] single_list = {88};
        int[] multi_list = {34, 78, 88, 28, 19, 37, 89, 11};

        // Test case 1: k= 0, list is empty, Expected output: 0
        assertEquals(0, UpdatedAverage.average(0, empty_list));

        // Test case 2: k has positive value, list is empty, Expected output: 0
        assertEquals(0, UpdatedAverage.average(8, empty_list));
        assertEquals(0, UpdatedAverage.average(78, empty_list));
        assertEquals(0, UpdatedAverage.average(65, empty_list));

        // Test case 3: k has negative value, list is empty, Expected output: 0
        assertEquals(0, UpdatedAverage.average(-4, empty_list));
        assertEquals(0, UpdatedAverage.average(-5, empty_list));

        // Test case 4: k has a positive value, list is not empty i.e it has more than one value,

        //Expected output: 88
        assertEquals(88, UpdatedAverage.average(5, single_list));

        //Expected output: 48
        assertEquals(48, UpdatedAverage.average(10, multi_list));
        assertEquals(48, UpdatedAverage.average(999, multi_list));

        //Expected output: 57
        assertEquals(57, UpdatedAverage.average(4, multi_list));

        //Expected output: 66
        assertEquals(66, UpdatedAverage.average(3, multi_list));

        // Test case 5: k=0, list is not empty i.e it has more than one value,
        //Expected output: 88
        assertEquals(88, UpdatedAverage.average(0,single_list ));
        //Expected output: 48
        assertEquals(48, UpdatedAverage.average(0, multi_list));

        // Test case 6: k has a negative value, list is not empty i.e it has more than one value,
        //Expected value: 88
        assertEquals(88, UpdatedAverage.average(-8, single_list));
        //Expected value: 48
        assertEquals(48, UpdatedAverage.average(-10, multi_list));

        // Test cases that fail:

        // Actual output: 0, Expected output: 88
        assertEquals(88, UpdatedAverage.average(0, single_list));

       // Actual output: 0, Expected output: 48
       assertEquals(48, UpdatedAverage.average(0, multi_list));

       // Actual output: 48, Expected output: 48
        assertEquals(48, UpdatedAverage.average(8, multi_list));

    }

}
