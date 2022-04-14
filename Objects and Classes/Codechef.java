/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	//create scanner object
    	Scanner input =new Scanner(System.in);

        //number of land
    	int number = input.nextInt();
    	
    	//Number of parts
		boolean[] valid = new boolean[number];
    	int[] parts = new int[number];
    	for(int i = 0; i < number; i++){
    	    parts[i] = input.nextInt();
    	    //lenght of the parts 
    	    int[] lenghts= new int[parts[i]];
    	    for(int j = 0; j < parts[i]; j++) {
    	        lenghts[j] = input.nextInt();
    	    }
    	    valid[i] = isValid(lenghts);
    	}

		//result 
		for(int i = 0; i < number; i++) { 
			if(valid[i]){
    	        System.out.println("yes");
    	    } else {
    	        System.out.println("no");
    	    }
		}
        
	}
	
	public static boolean isValid(int[] key){
	    boolean flag = false;
	    if(key.length % 2 == 0){
	        return false;
	    } else { 
			int m = key.length / 2;
       		int j = 1;
        	while(j <= m ) {
            	if((key[m] - key[m-j]) == j && (key[m] - key[m+j] == j)) { 
                	flag = true;
           		} else { 
                	flag = false;
                	break;
           		}
            	j++;
        	}
		}
	    
	    return flag;
	   
	}
}