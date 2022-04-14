import java.util.Scanner;
class ClosestPair { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);

        //number of point 
        System.out.print("Enter the number of points: ");
        int number = in.nextInt();

        //variable
        double[][] points = new double[number][2];

        //prompt user
        System.out.print("Enter the point: ");
        for(int i = 0; i < points.length; i++) { 
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }

        //variable 
        int p1 = 0, p2 = 1;
        double sortDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);


        //find sortest distance
        for(int i = 0; i < points.length; i++) { 
            for(int j = i + 1; j < points.length; j++) { 
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if(sortDistance > distance) { 
                    sortDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }


        //display all pairs that contain sortest distance
        for(int i = 0; i < points.length; i++) { 
            for(int j = i + 1; j < points.length; j++) { 
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if(sortDistance == distance) { 
                    System.out.println("Point ("+points[i][0]+","+points[i][1]+") and ("+points[j][0]+","+points[j][1]+")");
                }
            }
        }

        System.out.println("Their distance is "+sortDistance);

    }

    public static double distance (double x1, double y1, double x2, double y2) { 
        double distance = 0;

        distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        return distance;
    }
}