class Person {
    private String name = "";
    private String address = "";
    private String mobileNumber = "";
    private String eMail = "";
    
    public Person() {
        this.name = "Person";
        this.address = "Erath";
        this.mobileNumber = "9999999999";
        this.eMail = "person@gmail.com";
    }

    public Person(String name, String address, String mobileNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String geteMail() {
        return eMail;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String toString() {
        return "Person: \n  name = " + this.name + "\n  address = " + this.address +
                "\n   mobile Number = " + this.mobileNumber + "\n   eMail = " + this.eMail;  
    }
}
