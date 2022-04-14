class BoundingRectangle {

    private double[][] points = new double[5][2];
    double Xmin = 0, Xmax = 0, Ymin = 0, Ymax = 0;

    BoundingRectangle(double[][] points) {
        this.points = points;

        for(int i = 0; i < points.length; i++) {
            if(points[i][0] < Xmin) {
                Xmin = points[i][0];
            }

            if(points[i][0] > Xmax) {
                Xmax = points[i][0];
            }

            if(points[i][1] < Ymin) {
                Ymin = points[i][1];
            }

            if(points[i][1] > Ymax) {
                Ymax = points[i][1];
            }
        }
    }

    double[] getCenter() {
        double[] center = {(((double)Xmin + Xmax) / 2), (((double)Ymax + Ymin) / 2)};
        return center;
    }

    double getWidth() {
        return ((double)Ymax - Ymin);
    }

    double getHeight() {
        return ((double)Xmax - Xmin);
    }

}