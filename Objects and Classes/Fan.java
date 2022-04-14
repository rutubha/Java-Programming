class Fan { 
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double redius;
    private String colour;

    Fan() { 
        this.speed = SLOW;
        this.redius = 5;
        this.colour = "Blue";
        this.on = false;
    }

    Fan(int speed, boolean on, double redius, String colour) { 
        this.speed = speed;
        this.on = on;
        this.redius = redius; 
        this.colour = colour;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    void setOn(boolean on) {
        this.on = on;
    } 

    void setRedius(double redius) {
        this.redius = redius;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getColour() {
        return colour;
    }

    int getSpeed() {
        return speed;
    }

    double getRedius() {
        return redius;
    }

    boolean getOn() { 
        return on;
    }

    @Override
    public String toString() {
        String Object = "";

        if (on == true) { 
            Object = "Fan is On"+"Speed : "+this.speed+"\nColor : "+this.colour+"\nRedius : "+this.redius;
        } else { 
            Object = "Fan is Off"+"\nColor : "+this.colour+"\nRedius : "+this.redius;
        }
        return Object;
    }
}