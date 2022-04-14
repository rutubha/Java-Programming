class Random {
    int random;
    
    Random() { 
       System.out.println("Object created sucessufully.");
    }

    int nextInt(int value) { 
        int i = 0;
        int random = 1 + (int)(Math.random()*1000);

        if(random <= value)
            i = random;

        return i;
    }
}
