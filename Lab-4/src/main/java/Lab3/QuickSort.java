package Lab3;

public class QuickSort extends Sorter {
    private int[] quickSortArray;

    public QuickSort(){
        setName("Quick sort");
    }

    public int[] sort(int[] array) {
        measureStart();

        if (array == null || array.length == 0) {
            return array;
        }

        this.quickSortArray = array;
        quickSortOperation(0, quickSortArray.length - 1);

        measuresEnd();
        displayStats();

        return this.quickSortArray;
    }

    private void quickSortOperation(int low, int high) {
        int i = low, j = high;
        int middleElement = quickSortArray[low + (high-low)/2];

        while (i <= j) {
            while (quickSortArray[i] < middleElement) {
                i++;
            }

            while (quickSortArray[j] > middleElement) {
                j--;
            }

            if (i <= j) {
                int temp = quickSortArray[i];
                quickSortArray[i] = quickSortArray[j];
                quickSortArray[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSortOperation(low, j);
        if (i < high)
            quickSortOperation(i, high);
    }
}
