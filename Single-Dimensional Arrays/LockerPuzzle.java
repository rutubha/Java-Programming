class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];


        //invowk method
        lockerStatus(locker);

        //display oper locker
        System.out.println("Opern locker after the process is :");
        for (int i = 0; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print(i + " ");
            }
        }
       
        
    }

    public static void lockerStatus(boolean[] locker) {
        int[] student = new int[locker.length];

        for (int i = 0; i < student.length; i++) {
            student[i] = i + 1;
        }

        for (int i = 0; i < student.length; i++) {
            int s1 = student[i];
            int j = s1 - 1;
            while (j < student.length) {
                if (locker[j] == false) {
                    locker[j] = true;
                } else if (locker[j] == true) {
                    locker[j] = false;
                }

                j = j + s1;
            }
        }
    }
}
