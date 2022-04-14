class MyString {
    private char[] ch;
    
    public MyString(char[] chars) {
        ch = chars;
    }

    public char charAt(int index) {
        return ch[index];
    }

    public MyString subString(int begin, int end) {
        char[] chars = new char[end - begin];

        for(int i = 0; begin <= end; i++, begin++) {
            chars[i] = ch[begin];
        }

        return new MyString(chars);
    }

    public MyString toLowerCase() {
        char[] chars = new char[ch.length];

        for(int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(ch[i]);
        }

        return new MyString(chars);
    }

    public boolean equals(MyString s) {
        if(ch.length != s.ch.length) {
            return false;
        }

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != s.ch[i]) {
                return false;
            }
        }

        return true;
    }

    // public static MyString valueOf(int i) {
    //     return Integer.toString(i);
    // }
}
