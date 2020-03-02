package Search;

public class SetupBinarySearch {
    int array[];
    int low;
    int high;
    int value;

    SetupBinarySearch(){}
    public void SetupBinarySearch(int array[], int low, int high, int value){
        this.array = array;
        this.low = low;
        this.high = high;
        this.value = value;
    }

    public int binarySearch(int array[],int low, int high, int value){
        if (high >= low){
            int mid = low + (high - low)/2;
            if (array[mid] == value)
                return mid;
            if (array[mid] > value)
                return binarySearch(array, low, mid-1,value);
            return binarySearch(array, mid+1, high, value);
        }
        return -1;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
