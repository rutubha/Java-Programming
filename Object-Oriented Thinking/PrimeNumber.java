import java.util.ArrayList;

class PrimeNumber{
    private int num;

    PrimeNumber(int num){
        this.num = num;
    }

    int getNum(){
        return this.num;
    }

    ArrayList<Integer> getAllPrime(){
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i = 2; i < this.num; i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                a.add(i);
            }
        }

        return a;
    }

    public boolean isPrime(int number){
        boolean flage = true;
        if(number == 0 || number == 1){
            return false;
        } else if(number == 2){
            flage = true;
        } else {
            for(int i = 2; i <= number / 2; i++){
                if(number % i == 0){
                    flage = false;
                    break;
                }
            }
        }

        return flage;
    }
}