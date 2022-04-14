class MyPoint {
      private double x;
      private double y;
      
      MyPoint(){
          x = 0;
          y = 0;
      }

      MyPoint(double x, double y){
          this.x = x;
          this.y = y;
      }

      double getX(){
          return this.x;
      }

      double getY(){
          return this.y;
      }

      double distance(double x1, double y1){
          return Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1));
      }

      double distance(double x1, double y1, double x2, double y2){
          return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
      }
}
