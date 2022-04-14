import java.util.Scanner; 
class SortStudentByGrade {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //create answer key
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //prompt the user to enter the student answer 
        char[][] stAsw = new char[8][keys.length];

        System.out.println("Enter the student answer (e.g. ABCDGFHS): ");

        //scan row
        for(int i = 0; i < stAsw.length; i++) { 
            String input = in.nextLine();
            input = input.toUpperCase();
            //scan column
            for(int j = 0; j < keys.length; j++) { 
                stAsw[i][j] = (input.charAt(j));
            }
        }

        //display the correct answer given by student
        int[] correctAns = correctCount(keys, stAsw);

        //copy array to sort 
        //in every row first element is student number and second element is his mark
        int[][] copyAns = new int[correctAns.length][2];

        for(int i = 0; i < correctAns.length;i++) { 
            copyAns[i][1] = correctAns[i];
            copyAns[i][0] = i + 1;
        }

        //sort the copyAns array
        sort(copyAns);

        //Display sorted mark with which student it get
        for(int i = 0; i < correctAns.length; i++) { 

            /*first element is pesent student number and second element present his mark*/
            System.out.println("Student "+copyAns[i][0]+"'s correct count is "+copyAns[i][1]);
        }
    } 
    
    public static int[] correctCount(char[] key, char[][] answer) { 
        int[] correct = new int[answer.length];
        for(int i = 0; i < answer.length; i++) { 
            //count one student right answer
            int correctCount = 0;
            for(int j = 0; j < answer[i].length; j++) { 
                if(answer[i][j] == (key[j])) { 
                    correctCount++;
                    correct[i] = correctCount;
                }
            }
            
        }

        return correct;
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
