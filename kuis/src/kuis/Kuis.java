/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;

/**
 *
 * @author gisanimr
 */
public class Kuis {

    public static void main(String[] args) {
        
        String name;
        String email;
        String phoneNumber;

        ContactsManager myContacts = new ContactsManager();
        
        name = "Harry";
        email = "081111111111";
        phoneNumber = "harrypotter@gmail.com";
        Contact contact1 = new Contact(name, email, phoneNumber);
        myContacts.addContact(contact1);
       
        name = "Harmonie";
        email = "082222222222";
        phoneNumber = "harmoniegranger@gmail.com";
        Contact contact2 = new Contact(name, email, phoneNumber);
        myContacts.addContact(contact2);
        
        name = "Ron";
        email = "085555555555";
        phoneNumber = "ronweasly@gmail.com";
        Contact contact3 = new Contact(name, email, phoneNumber);
        myContacts.addContact(contact3);
        
        name = "Draco";
        email = "087777777777";
        phoneNumber = "dracomalfoy@gmail.com";
        Contact contact4 = new Contact(name, email, phoneNumber);
        myContacts.addContact(contact4);
        
        name = "Cedric";
        email = "089999999999";
        phoneNumber = "cedricdiggory@gmail.com";
        Contact contact5 = new Contact(name, email, phoneNumber);
        myContacts.addContact(contact5);
        
        Scanner input = new Scanner(System.in);

        String searchName;
        String loop;

        do {

            System.out.print("\nSearch name : ");
            searchName = input.nextLine();

            System.out.println("looking for " + searchName + "'s contact...");
            Contact result = myContacts.searchContact(searchName);
            try {
                
                System.out.println("name \t\t: " + result.getName());
                System.out.println("phone number \t: " + result.getPhoneNumber());
                System.out.println("email \t\t: " + result.getEmail());

            }catch (Exception error) {
                if (result==null) {
                    System.out.println("Contact not found!");
                }else{
                    System.out.println(error.getMessage());
                }
            }
            System.out.print("\nAgain?");
            loop = input.nextLine();

        }while (loop.equals("y"));
    }
}
