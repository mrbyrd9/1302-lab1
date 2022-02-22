// 
// Decompiled by Procyon v0.5.36
// 

package lab1;

public class ContactList
{
    private int numContacts;
    final int MAX_CONTACTS = 3;
    Contact[] contactList;
    String fn;
    String ln;
    String street;
    String cty;
    String st;
    String zip;
    
    public ContactList() {
        this.st = "";
        this.numContacts = 0;
        this.contactList = new Contact[3];
    }
    
    public int getNumContacts() {
        return this.numContacts;
    }
    
    public void addContact(final String fn, final String ln, final String street, final String cty, final String st, final String zip) {
        this.contactList[this.numContacts] = new Contact(fn, ln, street, cty, st, zip);
        ++this.numContacts;
    }
    
    @Override
    public String toString() {
        String myContact = "";
        for (int i = 0; i < this.numContacts; ++i) {
            myContact = String.valueOf(myContact) + this.contactList[i] + "\n";
        }
        return myContact;
    }
}
