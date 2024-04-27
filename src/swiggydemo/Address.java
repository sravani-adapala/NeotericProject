package swiggydemo;

public class Address {
    public String area;
    public String flatNo;
    public String pincode;


    @Override
    public boolean equals(Object obj) {

        if (this==obj){
            return true;
        }
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        Address otherAddress=(Address) obj;

        return this.area.equals(otherAddress.area)&&
                this.flatNo.equals(otherAddress.flatNo)&&
                this.pincode.equals(otherAddress.pincode);


    }



    @Override
    public String toString() {
        return "\n Address{" +
                "area='" + area + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
