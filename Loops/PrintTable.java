class PrintTable {
    public static void main(String[] args) {
        
        //create table using for loop
        /*for (int i =1; i < 10; i++) {
            for( int j = 1; j < 10; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println("");
        }*/

        //crate table using while
       /* int i =1;
        while (i<10) {
            int j = 1;
            while (j<10) {
                System.out.print(j+"*"+i+" ="+(j*i)+"\t");
                j++;
            }
            i++;
            System.out.println("");
        }*/   

         //crate table using do while
         int n =1;
         do {
             int j = 1;
            do {
                 System.out.print(j+"*"+n+" ="+(n*j)+"\t");
                 j++;
             }while (j<10);
             n++;
             System.out.println("");
         }  while (n<10);
    }    
}
