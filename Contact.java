// 
// Decompiled by Procyon v0.5.36
// 

package lab1;

public class Contact
{
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    
    public Contact(final String fn, final String ln, final String street, final String cty, final String st, final String zip) {
        this.state = "";
        this.firstName = fn;
        this.lastName = ln;
        this.zipCode = zip;
        this.streetAddress = street;
        this.city = cty;
        this.state = st;
    }
    
    @Override
    public String toString() {
        final String myContact;
        return myContact = this.firstName + " " + this.lastName + "\n" + this.streetAddress + "\n" + this.city + ", " + this.state + " " + this.zipCode + "\n";
    }
    
    public static void main(final String[] args) {
    }
}
