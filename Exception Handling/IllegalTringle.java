class IllegalTringle {
    public static void main(String[] args) {
        try {
            Trinagle t = new Trinagle(-1, 1, 2);
            System.out.println(t.toString());
        } catch (IllegalTrinagleException e) {
            System.out.println(e);
        }
    }    
}
