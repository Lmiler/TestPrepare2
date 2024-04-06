public class DynamicArray {
    private int[] numbers;

    public DynamicArray() {
        this.numbers = new int[0];
    }

    int size() {
        return this.numbers.length;
    }

    void add(int value) {
        int[] temp = new int[this.numbers.length + 1];
        for (int i = 0; i < this.numbers.length; i++) {
            temp[i] = this.numbers[i];
        }
        temp[temp.length - 1] = value;
        this.numbers = temp;
    }

    int get(int index) {
        return this.numbers[index];
    }

    void removeByIndex(int index) {
        int[] array = new int[this.numbers.length - 1];
        int j = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            if (i != index) {
                array[j] = this.numbers[i];
                j++;
            }
        }
        this.numbers = array;
    }

    void removeByValue(int value) {
        int size = this.numbers.length - this.count(value);
        int[] array = new int[size];
        int j = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] != value) {
                array[j] = this.numbers[i];
                j++;
            }
        }
        this.numbers = array;
    }

    int count(int value) {
        int count = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            if (this.numbers[i] == value) {
                count++;
            }
        }
        return count;
    }

    void insert(int value, int index) {
        int[] array = new int[this.numbers.length + 1];
        int i;
        for (i = 0; i < index; i++) {
            array[i] = this.numbers[i];
        }
        array[i + 1] = this.numbers[i];
        array[i] = value;
        for (int j = index + 1; j < array.length; j++) {
            array[j] = this.numbers[i];
            i++;
        }
        this.numbers = array;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.numbers.length; i++) {
            output += this.numbers[i] + ",";
        }
        return output;
    }
}

