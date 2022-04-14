class StopWatch { 
    long startTime;
    long endTime;

    StopWatch() { 
        startTime = System.currentTimeMillis();
    }

    void start() { 
        startTime = System.currentTimeMillis();
    }

    void stop() { 
        endTime = System.currentTimeMillis();
    }

    long getElapsedTime() { 
        return (endTime - startTime);
    }
}