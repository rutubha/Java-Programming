public class DynamicArray {
    int[] arry;
    int count;
    int size;

    public DynamicArray() { 
        arry = new int[1];
        count = 0;
        size = 1;
    }
    
    public void add(int data) {
        if (count == size) { 
            growSize();
        }

        arry[count] = data;
        count++;

        shrinkSize();
    }

    public void growSize() { 
        int[] temp = null;
        if (count == size) {
            temp = new int[size * 2];
            for (int i = 0; i < size; i++) { 
                temp[i] = arry[i];
            }
        }

        arry = temp;
        size = size * 2;
    }

    public void shrinkSize() { 
        int[]  temp = null;
        if(count > 0) {
            temp = new int[count];
            for(int i = 0; i < count; i++) {
                temp[i] = arry[i];
            }
        }

        size = count;

        arry = temp;

    } 
    
}   
