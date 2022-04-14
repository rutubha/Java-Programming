class MyStringBuilder2 {
    String s = "";
    
    MyStringBuilder2() {
        this.s = "";
    }

    MyStringBuilder2(char[] chars) {
        for(int  i = 0; i < chars.length; i++) {
            this.s += chars[i];
        }
    }

    MyStringBuilder2(String s) {
        this.s = s;
    }

   MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
       String s1 = this.s.substring(0, offset);
       String s2 = this.s.substring(offset);

       String s3 = s1 + s.s + s2;

       return new MyStringBuilder2(s3);
   }

   MyStringBuilder2 reverse() {
       String s1 = "";
       for(int i = this.s.length() - 1; i >= 0; i--) {
           s1 = s1 + this.s.charAt(i);
       }

       return new MyStringBuilder2(s1);
   }

   MyStringBuilder2 subString(int begin) {
       return new MyStringBuilder2(this.s.substring(begin));
   }

   MyStringBuilder2 toUpperCase() {
       return new MyStringBuilder2(this.s.toUpperCase());
   }
}
