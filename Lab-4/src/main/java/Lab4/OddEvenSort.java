package Lab4;

public class OddEvenSort extends Sorter{

    public OddEvenSort() {
        setName("Odd even sort");
    }

    public int[] sort(int[] array) {
        measureStart();

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 1; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }

            for (int i = 0; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        measuresEnd();
        displayStats();

        return array;
    }
}
