public class Contact {
    private String fullName;
    private String city;
    private String phoneNO;

    public void Contact(){
        this.fullName = fullName;
        this.city = city;
        this.phoneNO = phoneNO;
    }
    //Getting Input and Setting Input
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getPhoneNO(){
        return phoneNO;
    }
    public void setPhoneNO(String phoneNO){
        this.phoneNO = phoneNO;
    }
    public String toString(){
        return ("Full Name: "+ fullName + "\nCity:" +city +"\nPhone Number:"+phoneNO);
    }
}
