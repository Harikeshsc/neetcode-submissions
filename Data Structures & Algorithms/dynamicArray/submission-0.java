class DynamicArray {
private int[] array;
    private int size =0;
    private int capacity;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
         if (size == capacity) {
            resize();
        }
        array[size] = n;
        size++;
    }

    public int popback() {  
        size--;    
        return array[size];
    }

    private void resize() {
 capacity *= 2;
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size); 
        array = newArray;
    }

    public int getSize() {
    return this.size;
    }

    public int getCapacity() {
        return capacity;
    }
}
