import java.util.Scanner; 
class SortString {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner in = new Scanner(System.in);

        //prompt the user to enter the string
        System.out.print("Enter the string: ");
        String value = in.next();

        //sort string by invowking mehtod
        
        System.out.println("Sorted string is "+ sortString(value));

    }

    public static String sortString(String value) {
        //Create char array of size string
        int size = value.length();
        char[] list = new char[size];

        //copy string into char array
        for(int i = 0; i < size; i++) {
            list[i] = value.charAt(i);
        }

        //sort char array
        for(int i = 0; i < list.length; i++) { 
            //assume element at ith position is minimum value
            int index = i;
            //check for the minimum value
            for(int j = i + 1; j < list.length - i; j++) { 
                //if minimum value index is greater than its next value than assign index as next value otherwise skip and looking for next 
                if (list[index] > list[j]) { 
                    index = j;
                }
            }
            //now swap ith element with the loswest value (index)
            char temp = (char)list[i];
            list[i] = (char)list[index];
            list[index] = temp;
            
        }
        
        //store char array in string
        String result = "";
        for(int i = 0; i < list.length; i++) { 
            result = result + list[i];
        }

        return result;
        
    }

}