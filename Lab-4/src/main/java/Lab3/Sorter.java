package Lab3;

public abstract class Sorter {
    long timeStart;
    long memoryStart;
    long timeEnd;
    long memoryEnd;
    String sortMethodName;

    void measureStart() {
        timeStart = System.nanoTime();
        memoryStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    void measuresEnd() {
        timeEnd = System.nanoTime();
        memoryEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    long getTime() {
        return timeEnd - timeStart;
    }

    long getMemory() {
        return memoryEnd - memoryStart;
    }

    void displayStats() {
        System.out.println(sortMethodName + " run time: " + getTime() + " ns, memory usage: " + getMemory());
    }

    void setName(String name) {
        sortMethodName = name;
    }

    abstract int[] sort(int[] array);
}
