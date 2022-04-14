import java.util.Scanner;
class ConsecutiveFour { 
    public static void main(String[] args) { 
        //Create Scanner Object
        Scanner in = new Scanner(System.in);

        //prompt the user enter the array
        System.out.print("Enter the number of values: ");
        int number = in.nextInt();

        int[] values = new int[number];

        System.out.print("Enter the values : ");
        for(int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        //check whether its consecutive or not
        boolean flag = isConsecutiveFour(values);

        if(flag) {
            System.out.println("The list has consecutive fours.");
        } else { 
            System.out.println("The list has no consecutive fours.");
        }


    }

    public static boolean isConsecutiveFour (int[] values) {
        //Create flag value to return true or false
        boolean flag = false;
        //create count variable to count the consecutive four
        int count = 0;
       
        //create four loop to scan value
        for(int i = 0; i < values.length; i++) {
            //create key value to check its consecutive or not
            int key = values[i];
            //create j variable for while loop
            int j = i;

            //do- while loop to check key value is consecutive or not
            do {

                //if key value and its next value is equal than increament counter otherwise reset the counter
                if (key == values[j]) {
                    count++;

                    //check if count is 4 than key value is consecutive so flag become true and break loop
                    if(count == 4) {
                        flag = true;
                        break;
                    }
                } else {
                    count = 0;
                }
               j++;
    
            } while (count == 4 || j < values.length);
    
        }

        return flag;
        
    }
}
