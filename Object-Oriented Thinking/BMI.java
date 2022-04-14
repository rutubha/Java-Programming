class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    
    BMI(String name, int age, double weight, double feet, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight * 0.45359237;
        this.height = (inches * 0.0254) + (feet * 0.3048);
    }

    String getName(){
        return this.name;
    }

    int getAge() {
        return age;
    }
    double getBMI(){
        return (double)(weight)/(height*height);
    }

    String getInterpretion(){
        double bmi = (double)(weight)/(height*height);
        String s = "";
        if(bmi < 18.5){
            s = "Underweight";
        } else if(bmi < 25){
            s = "Normal";
        } else if(bmi < 30){
            s = "Overweight";
        } else {
            s = "Obese";
        }
        
        return s;
    }
}
