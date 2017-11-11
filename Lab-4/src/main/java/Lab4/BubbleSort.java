package Lab4;

public class BubbleSort extends Sorter {

    public BubbleSort(){
        setName("Bubble sort");
    }

    public int[] sort(int[] array){
        measureStart();

        int loops = 0;
        for (int i = 0; i < array.length; i++) {
            int swaps = 0;
            for (int j = 1; j < array.length - loops; j++) {
                if(array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swaps++;
                }
            }
            loops++;

            if(swaps == 0)
                break;
        }

        measuresEnd();
        displayStats();

        return array;
    }
}
