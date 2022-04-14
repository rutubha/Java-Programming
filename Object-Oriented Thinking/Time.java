class Time{ 
    private int hour;
    private int minute;
    private int second;

    //no args constructor
    Time(){ 
        long cur_ms = System.currentTimeMillis();
        cur_ms = cur_ms / 1000;
        second = (int)cur_ms % 60;
        cur_ms = cur_ms / 60;
        minute = (int)cur_ms % 60;
        cur_ms = cur_ms / 60;
        hour = (int)cur_ms % 24;
    }

    //args constructor
    Time(int hour, int minute, int second){ 
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Time(long elapseTime) { 
        elapseTime = elapseTime / 1000;
        second = (int)(elapseTime % 60);
        elapseTime = elapseTime / 60;
        minute = (int)(elapseTime % 60);
        elapseTime = elapseTime / 60;
        hour = (int)(elapseTime % 24);
    }

    //getter method
    int getHour() {
        return (int)hour;
    }

    int getMinute() {
        return (int)minute;
    }

    int getSecond() {
        return (int)second;
    }

    void setTime(long elapseTime){ 
        elapseTime = elapseTime / 1000;
        second = (int)(elapseTime % 60);
        elapseTime = elapseTime / 60;
        minute = (int)(elapseTime % 60);
        elapseTime = elapseTime / 60;
        hour = (int)(elapseTime % 24);
    }
}