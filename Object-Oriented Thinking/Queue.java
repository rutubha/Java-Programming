class Queue {
    private double[] Queue;
    private int size;
    private int point = 0;
    private int start = 0;

    Queue() {
        size = 8;
        double[] queue = new double[size];
        Queue = queue; 
    }

    void enqueue(double data) {
        if(point < size) {
            Queue[point] = data;
            point++;
        } else {
            double[] queue = new double[2 * size];
            size = size * 2;

            for(int i = 0; i < Queue.length; i++) {
                queue[i] = Queue[i];
            }

            Queue = queue;
            Queue[point] = data; 
        }    
    }

    double dequeue() {
        double remove = Queue[0];
        if(point > 0) {
            remove = Queue[0];
            for(int i = 0; i <= point && i < Queue.length - 1; i++) {
                Queue[i] = Queue[i + 1]; 
            }
            point--;
        } 
        return remove;
    }

    boolean empty(){
        if(point == 0) {
            return true;
        } else {
            return false;
        }
    }

    int getSize(){ 
        return size;
    }
}
