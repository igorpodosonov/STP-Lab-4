package Lab3;

public class CycleSort extends Sorter {

    public CycleSort() {
        setName("Cycle sort");
    }

    public int[] sort(int[] array) {
        measureStart();

        for (int i = 0; i < array.length; i++) {
            int val = array[i];

            int pos = i;
            for (int j = pos + 1; j < array.length; j++) {
                if(array[j] < val) {
                    pos++;
                }
            }

            if(pos == i)
                continue;

            while (val == array[pos])
                pos++;

            int tmp = array[pos];
            array[pos] = val;
            val = tmp;

            while (pos != i) {
                pos = i;
                for (int j = i + 1; j < array.length; j++) {
                    if(array[j] < val)
                        pos++;
                }

                while (val == array[pos])
                    pos++;

                tmp = array[pos];
                array[pos] = val;
                val = tmp;
            }
        }

        measuresEnd();
        displayStats();

        return array;
    }
}
