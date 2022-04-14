class MyInteger{
    private int value;
    
    //Constructor
    MyInteger(int value){
        this.value = value;
    }

    int getInt(){
        return this.value;
    }

    boolean isEven(){
        return (this.value % 2 == 0);
    }

    boolean isOdd(){
        return (this.value % 2 == 1);
    }

    boolean isPrime(){
        boolean isPrime = true;
        
        int i = 2;
        while(i <= (this.value / 2) && isPrime){
            if(this.value % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    } 
}