import java.util.Scanner; 
class NearestPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //variable
        double[][] point = new double[8][3];

        //prompt user
        System.out.println("Enter the point: ");
        for(int i = 0; i < point.length; i++) { 
            System.out.println("point"+(i+1));
            for(int j = 0; j < point[i].length; j++) { 
                point[i][j] = in.nextDouble();
            }
        }

        //find nearest point
        int p1 = 0, p2 = 1;
        //assume that first two are sortest distance
        double sortDistance = distance(point[p1][0], point[p1][1], point[p2][2], point[p2][0], point[p2][1], point[p2][2]);

        //compute for each point
        //scan point
        for(int i = 0; i < point.length; i++) { 
            //scan each point to find distance
            for(int j = i + 1; j < point.length; j++) { 
                double distance = distance(point[i][0], point[i][1], point[i][2], point[j][0], point[j][1], point[j][2]);

                //if distance is less than assign it in sortdistance and track this point by p1 and p2
                if(sortDistance > distance) { 
                    p1 = i;
                    p2 = j;
                    sortDistance = distance;
                }
            }
        }

        //Display the result
        System.out.println("Point ("+point[p1][0]+","+point[p1][1]+","+point[p1][2]+") and ("+point[p2][0]+","+point[p2][1]+","+point[p2][2]+") is sortest path "+sortDistance);

    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) { 
        double distance = 0;

        distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)) + ((z2 - z1)*(z2 - z1)));

        return distance;
    }
}
