import Lab4.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTests {
    private int[] originalArray, sortedArray;

    @Before
    public void initArrays() {
        originalArray = new int[30];
        Random rnd = new Random();

        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = rnd.nextInt(100);
        }
    }

    @Test (timeout =  30000)
    public void bubbleSortTest() throws Exception {
        BubbleSort sorter = new BubbleSort();
        sortedArray = sorter.sort(originalArray);

        //Original array is now sorted
        Arrays.sort(originalArray);

        //Check if sortedArray sorted properly
        Assert.assertArrayEquals(sortedArray, originalArray);
    }

    @Test (timeout =  30000)
    public void oddEvenSortTest() throws Exception {
        OddEvenSort sorter = new OddEvenSort();
        sortedArray = sorter.sort(originalArray);

        //Original array is now sorted
        Arrays.sort(originalArray);

        //Check if sortedArray sorted properly
        Assert.assertArrayEquals(sortedArray, originalArray);
    }

    @Test (timeout =  30000)
    public void cycleSortTest() throws Exception {
        CycleSort sorter = new CycleSort();
        sortedArray = sorter.sort(originalArray);

        //Original array is now sorted
        Arrays.sort(originalArray);

        //Check if sortedArray sorted properly
        Assert.assertArrayEquals(sortedArray, originalArray);
    }

    @Test (timeout =  30000)
    public void quickSort() throws Exception {
        QuickSort sorter = new QuickSort();
        sortedArray = sorter.sort(originalArray);

        //Original array is now sorted
        Arrays.sort(originalArray);

        //Check if sortedArray sorted properly
        Assert.assertArrayEquals(sortedArray, originalArray);
    }
}
