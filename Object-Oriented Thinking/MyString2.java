class MyString2 {
    char[] s;

    MyString2(char[] s) {
        this.s = s;
        // this.s  = new char[s.length];

        // for(int i = 0; i < s.length; i++) {
        //     this.s[i] = s[i];
        // }
    }

    public int compare(String s) {
        int i = 0;
        if(this.s.length > s.length()) {
            return 1;
        }
        else if(this.s.length < s.length()){
            return -1;
        }
        while(this.s.length > i) {
            if(this.s[i] > s.charAt(i)) {
                return 1;
            }

            if(this.s[i] < s.charAt(i)) {
                return -1;
            }

            i++;
        }

        return 0;
    }

    public MyString2 subString(int begin) {
        char[] subS = new char[s.length - begin];

        for(int i = begin, j = 0; i < s.length; i++,j++) {
            subS[j] = s[i];
        }

        return new MyString2(subS);
    }

    public MyString2 toUpperCase() {
        char[] toUppS = new char[s.length];

        for(int i = 0; i < s.length; i++) {
            toUppS[i] = Character.toUpperCase(s[i]);
        }

        return new MyString2(toUppS);
    }

    public static MyString2 valueOf(boolean b) {
        if(b) {
            char[] tr = {'t','r','u','e'};
            return new MyString2(tr);
        } else {
            char[] fl = {'f','a','l','s','e'};
            return new MyString2(fl);
        }
    }
}