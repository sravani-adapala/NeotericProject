package equalshashcode;

import java.util.Set;

public class Address {
    public  String area;
    public String state;
    public String street;
    public String flatNo;
    public String pincode;

    public boolean equals(Object obj){

        Address otherAddress=(Address) obj;
        return  this.area.equals(otherAddress.area)&&this.state.equals(otherAddress.state)&&
                this.street.equals(otherAddress.street)&&this.flatNo.equals(otherAddress.flatNo)&&
                this.pincode.equals(otherAddress.pincode);
    }


}
