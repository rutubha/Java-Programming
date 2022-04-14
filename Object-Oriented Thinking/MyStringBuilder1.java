class MyStringBuilder1 {
    String s = "";
    
    MyStringBuilder1() {
        this.s = "";
    }

    MyStringBuilder1(String s) {
        this.s = s;
    }

    MyStringBuilder1 append(MyStringBuilder1 s) {
        return new MyStringBuilder1(this.s + s.s);
    }

    MyStringBuilder1 append(int i) {
        return new MyStringBuilder1(this.s + i);
    }

    int length() {
        return this.s.length();
    }

    char charAt(int index) {
        return this.s.charAt(index);
    }
    
    MyStringBuilder1 toLowercase() {
        return new MyStringBuilder1(this.s.toLowerCase());
    }

    MyStringBuilder1 substring(int begin, int end) {
        String sub = this.s.substring(begin, end);

        return new MyStringBuilder1(sub);
    }

    @Override
    public String toString() {
        return this.s;
    }
}
