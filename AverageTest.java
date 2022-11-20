import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageTest {
    @Test
    public void averageTest(){
        int[] empty_list = new int[0];
        int[] single_list = {88};
        int[] multi_list = {34, 78, 88, 28, 19, 37, 89, 11};

        // Test case 1: k= 0, list is empty, Expected output: 0
        assertEquals(0, Average.average(0, empty_list));

        // Test case 2: k has positive value, list is empty, Expected output: 0
        assertEquals(0, Average.average(8, empty_list));
        assertEquals(0, Average.average(78, empty_list));
        assertEquals(0, Average.average(65, empty_list));

        // Test case 3: k has negative value, list is empty, Expected output: 0
        assertEquals(0, Average.average(-4, empty_list));
        assertEquals(0, Average.average(-5, empty_list));

        // Test case 4: k has a positive value, list is not empty i.e it has more than one value,

        //Expected output: 88
        assertEquals(88, Average.average(5, single_list));

        //Expected output: 48
        assertEquals(48, Average.average(10, multi_list));
        assertEquals(48, Average.average(999, multi_list));

        //Expected output: 57
        assertEquals(57, Average.average(4, multi_list));

        //Expected output: 66
        assertEquals(66, Average.average(3, multi_list));

        // Test case 5: k=0, list is not empty i.e it has more than one value, Expected output: 0
        assertEquals(0, Average.average(0,single_list ));
        assertEquals(0, Average.average(0, multi_list));

        // Test case 6: k has a negative value, list is not empty i.e it has more than one value, Expected value: 0
        assertEquals(0, Average.average(-8, single_list));
        assertEquals(0, Average.average(-10, multi_list));

        // Test cases that fail:

        // Actual output: 0, Expected output: 78
        assertEquals(78, Average.average(0, single_list));

        //Actual output: 0, Expected output: 57
        assertEquals(57, Average.average(0, multi_list));

        //Actual output: 0, Expected output: 66
        assertEquals(67, Average.average(3, multi_list));


    }

}
