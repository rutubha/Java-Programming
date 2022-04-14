import java.util.ArrayList;

class PrimeFactor{
    private int num;

    PrimeFactor(int num){
        this.num = num;
    }

    int getNum(){
        return this.num;
    }

    ArrayList<Integer> getPrimeFactor(){
        ArrayList<Integer> a = new ArrayList<>(); 

        int i = 2;
        while(num != 0 && i <= num){
            if(num % i == 0){
                a.add(i);
                num = num / i;
            } else {
                i++;
            }
        }
        return a;
    }
}