class MyCharacter {
    char ch;
    
    MyCharacter(char ch) {
        this.ch = ch;
    }

    boolean isWitespace() {
        if((int)this.ch == 32) {
            return true;
        } else {
            return false;
        }
    }

    boolean equals(char ch) {
        if((int)this.ch == (int)ch) {
            return true;
        } else {
            return false;
        }
    }

    // @Override
    // String toString() {
    //     return "char" + this.ch;
    // }

    public int hashCode() {
        return (int)ch;
    }

    int compareTo(char ch) {
        if((int)this.ch < (int)this.ch) {
            return -1;
        } else if ((int)this.ch < (int)this.ch) {
            return 1;
        } else {
            return 0;
        }
    }

    boolean isDigit() {
        if((int)this.ch >= 48 && (int)this.ch <= 57) {
            return true;
        } else {
            return false;
        }
    }

    boolean isLowerCase() {
        if((int)this.ch >= 97 && (int)this.ch <= 122) {
            return true;
        } else {
            return false;
        } 
    }

    boolean isUpperCase() {
        if((int)this.ch >= 65 && (int)this.ch <= 90) {
            return true;
        } else {
            return false;
        }
    }

    char toLowerCase() {
        if((int)this.ch >= 65 && (int)this.ch <= 90) {
            return (char)((int)this.ch + 32);
        }

        return this.ch;
    }
    char toUpperCase() {
        if((int)this.ch >= 97 && (int)this.ch <= 122) {
            return (char)((int)this.ch - 32);
        }

        return this.ch;
    }
}
