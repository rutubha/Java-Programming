class WeeklyHour {
    public static void main(String[] args) {
        int[][] weeklyHour = {{2, 4, 3, 4, 5, 8, 8},
                              {7, 3, 4, 3, 3, 4, 4},
                              {3, 3, 4, 3, 3, 2, 2},                     
                              {9, 3, 4, 7, 3, 4, 1},
                              {3, 5, 4, 3, 6, 3, 8},
                              {3, 4, 4, 6, 3, 4, 4},
                              {3, 7, 4, 8, 3, 8, 4}};
        
        int[][] totalWorkingHour = totalHour(weeklyHour); 
        
        sort(totalWorkingHour);

        for(int i = 0; i < weeklyHour.length; i++) {
            System.out.println("Employees "+totalWorkingHour[i][0]+" total weekly hour is "+totalWorkingHour[i][1]);
        }                       
    }   
    
    public static int[][] totalHour(int[][] weeklyHour) { 
        int[][] total = new int[weeklyHour.length][2];
        for(int i = 0; i < weeklyHour.length; i++) { 
            int sum = 0;
            for(int j = 0; j < weeklyHour[i].length; j++) { 
                sum = weeklyHour[i][j] + sum;
            }

            total[i][0] = i + 1;
            total[i][1] = sum;
        }


        return total;
    }

    public static void sort(int[][] list) { 
        for(int i = 0; i < list.length; i++) { 
            int index = i;
            for(int j = i ; j < list.length ; j++) { 
                if(list[index][1] > list[j][1]) { 
                    index = j;
                }
            }

            int temp = list[i][1];
            list[i][1] = list[index][1];
            list[index][1] = temp;

            int temp1 = list[i][0];
            list[i][0] = list[index][0];
            list[index][0] = temp1;
        }
    }
}
