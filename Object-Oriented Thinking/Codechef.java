import java.util.Scanner;
/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);

        //testcase
        int testcase = in.nextInt();

        //store result in boolean array
        int[] result = new int[testcase];

        for(int i = 0; i < testcase ; i++){ 
            int[] digit = new int[5];
            for(int j = 0; j < 5; j++){ 
                digit[j] = in.nextInt();
            }
            result[i] = winBy(digit);
        }

        for(int i = 0; i < testcase; i++){
            if(result[i] == 0){
                System.out.println("DRAW");
            } else if (result[i] == 1){
                System.out.println("INDIA");
            } else if(result[i] == 2){
                System.out.println("ENGLAND");
            }
        }

	}

   /* public static boolean isWin(int[] arr){
        boolean isWin = false;

        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] == 7){ 
                isWin = true;
                break;
            }
        }

        return isWin;
    }

    public static int winBy(int[] arr){
        int winBy = 0;

        int numIndia = 0;
        int numEng = 0;

        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] == 1){
                numIndia++;
            } else if(arr[i] == 2){
                numEng++;
            }
        }
        
        if(numIndia == numEng){
            winBy = 0;
        } else if(numIndia > numEng){
            winBy = 1;
        } else if(numEng > numIndia){
            winBy = 2;
        }

        return winBy;
    }
}*/
/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();

        int[] answer = new int[testcase];

        for(int i = 0; i < testcase; i++){ 
            int x = in.nextInt();
            int y = in.nextInt();
            answer[i] = danceMoves(x, y);
        }

        for(int i = 0; i < testcase; i++){ 
            System.out.println(answer[i]);
        }

	}

    public static int danceMoves(int x, int y){ 
        int moves = 0;

        while(x != y){ 
            if(x < y){
                x = x + 2;
                moves++;
            } else if(x > y){ 
                x = x - 1;
                moves++;
            } else {
                break;
            }
        }


        return moves;
    }

}*/

import javax.swing.text.html.HTMLDocument.RunElement;

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();

        int[][] answer = new int[testcase][2];

        for(int i = 0; i < testcase; i++){ 
            int x = in.nextInt();
            int k = in.nextInt();
            answer[i] = minMax(x, k);
        }

        for(int i = 0; i < testcase; i++){
            System.out.println(answer[i][0]+" "+answer[i][1]);
        }

	}

    public static int[] minMax(int x, int k){ 
        int[] ans = new int[2];

        int i = x + 1;
        int  j = x * k - 1;
        while(i <= (x * k) && j >= x && i < j) { 
            int lcm1 = LCM(x, i);
            int lcm2 = LCM(j, (x * k));

            if(lcm1 % x == 0 && lcm2 % x == 0){ 
                ans[0] = i;
                ans[1] = j;
                break;
            } else {
                i++;
                j--;
            }
        }
        return ans;
    }

    public static int LCM(int x, int y){ 
        int lcm = 1;
        int gcd = 1;

        for(int i = 1; i <= x && i <= y; i++){
            if(x % i == 0 && y % i == 0){ 
                gcd = i;
            }
        }

        lcm = (x * y) / gcd;

        return lcm;
    }
}*/

/*class Codechef {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        String[] result = new String[testcase];
        for(int i = 0; i < testcase; i++){ 
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();

            result[i] = getCheaper(x, y, a, b, k);
        }

        for(int i = 0; i < testcase; i++){
            System.out.println(result[i]);
        }
    }

    public static String getCheaper(int x, int y, int a, int b, int k){
        String cheaperPrice; 
        for(int i = 0; i < k; i++){ 
            x += a;
            y += b;
        }

        if(x > y) {
            cheaperPrice = "DIESEL";
        } else if (x < y){ 
            cheaperPrice = "PETROL";
        } else {
            cheaperPrice = "SAME PRICE";
        }

        return cheaperPrice;
    }
}*/

/*class Codechef {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        boolean[] result = new boolean[testcase];

        for(int i = 0; i < testcase; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            result[i] = isDistributed(x, y);
        }

        for(int i = 0; i < testcase; i++){
            if(result[i]){
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isDistributed(int x, int y) {
        boolean ans = false;
        if(x % 2 == 0 && y % 2 == 0) {
            ans = true;
        } else if(y % 2 == 1 && x == y + 2) {
            ans = true;
        }

        return ans;
    }*/

/*class Codechef {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner in = new Scanner(System.in);
            int testcase = in.nextInt();
            int[] result = new int[testcase];
            
            for(int i = 0; i < testcase; i++) {
                int n = in.nextInt();
                int[] array = new int[n];
                for(int j = 0; j < n; j++) {
                    array[j] = in.nextInt();
                }

                result[i] = minOperation(n, array);
            }

            for(int i = 0; i < testcase; i++){
                System.out.println(result[i]);
            }
        }

        public static int minOperation(int n, int[] array) {
            int count = 0;
            int i = 0;
            int j = n - 1;

            while(i < j) {
                if(array[i] == array[j]) {
                    i++;
                    j--;
                } else if (array[i] < array[j]) {
                    i++;
                    array[i] += array[i - 1];
                    count++;
                } else if(array[i] > array[j]) {
                    j--;
                    array[j] += array[j + 1]; 
                    count++;
                }
            }

            return count;
        }
}  */

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int breadth = in.nextInt();

        int area = length *breadth;
        int peri = 2 * (length + breadth);

        if(area > peri) {
            System.out.println("Area");
            System.out.println(area);
        } else if (area < peri) {
            System.out.println("Peri");
            System.out.println(peri);
        } else {
            System.out.println("Eq");
            System.out.println(area);
        }

	}
}*/

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();

        while(l <= r) {
            if(l % 2 == 1) {
                System.out.print(l + " ");
            }

            l++;
        }
    }
}*/

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        String[] st = new String[testcase];

        for(int i = 0; i < testcase; i++) {
            st[i] = in.next();
            st[i] = st[i].replaceAll("party", "pawri");
        }

        for(int i = 0; i < testcase; i++) {
            System.out.println(st[i]);
        }
    }
}*/

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        int num = 1;

        while(count <= n) {
            if(count % 2 == 1) {
                int temp = num;
                for(int i = temp; i <= temp + 4; i++){
                    System.out.print(i+" ");
                    num++;
                }
            } else {
                int temp = num;
                for(int i = temp + 4; i >= temp; i--) {
                    System.out.print(i +" ");
                    num++;
                }
            }
            System.out.println();
            count++;
        }
    }
}*/

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        int[] ans = new int[testcase];

        for(int i = 0; i < testcase; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            ans[i] = whoWin(arr);
        }

        for(int i : ans) {
            System.out.println(i);
        }
    }

    public static int whoWin(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        if(sum % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}*/

// class Codechef
/*{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        int[] k = new int[testcase];
        
        for(int i = 0; i < testcase; i++) {
            int n = in.nextInt();
            k[i] = minVal(n);
        }

        for(int i = 0; i < testcase; i++) {
            System.out.println(k[i]);
        }
    }

    public static int minVal(int n) { 
        int sum = 0;
        int i = 1;
        
        while(sum < n) {
            String binary = Integer.toBinaryString(i);
            int j = 0;
            while(j  <= binary.length()) {
                sum = sum + ((int)binary.charAt(2 * j) - 48);
                j++;
            }
            if(sum >= n) {
                break;
            }
            i++;
        }
        return i;
    }
}*/

/*class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();

        boolean[] result = new boolean[testcase];

        for(int i = 0; i < testcase; i++) {
            int s = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            result[i] = buyOrNot(s, a, b, c);
        }

        for(int i = 0; i < testcase; i++) {
            if(result[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean buyOrNot(int s, int a, int b, int c) {
        double change = s + (s * ((double)c / 100));

        if(change <= b && change >= a) {
            return true;
        } else {
            return false;
        }
    }
}*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        int testcase = in.nextInt();
        int[] result = new int[testcase];

        for(int i = 0; i < testcase; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            result[i] = minPizza(n, k);
        }

        for(int i = 0; i < testcase; i++){
            System.out.println(result[i]);
        }
    }

    public static int minPizza(int n, int k) {
        if(n == k) {
            return 1;
        } else if (n % k == 0) {
            return (n / k);
        } else {
            return n;
        }     
    }
}