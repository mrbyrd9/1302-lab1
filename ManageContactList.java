// 
// Decompiled by Procyon v0.5.36
// 

package lab1;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ManageContactList
{
    public static void main(final String[] args) throws FileNotFoundException {
        String st = "";
        final File file = new File("P:\\contacts.txt");
        final Scanner scnr = new Scanner(file);
        scnr.useDelimiter(";");
        final NewContactList list = new NewContactList();
        while (scnr.hasNext()) {
            final String fn = scnr.next();
            final String ln = scnr.next();
            final String street = scnr.next();
            final String cty = scnr.next();
            st = scnr.next();
            final String zip = scnr.next();
            list.addContact(fn, ln, street, cty, st, zip);
        }
        System.out.println(list.toString());
        System.out.println("Total: " + list.getNumContacts());
    }
}
