package com.tgt.assignment.day4.programs;

// still working on it

import com.tgt.assignment.day4.dao.ArrayListContactDao;
import com.tgt.assignment.day4.dao.ContactsDao;
import com.tgt.assignment.day4.entity.Contact;
import com.tgt.assignment.day4.entity.Gender;
import com.tgt.assignment.day4.exception.DaoException;
import com.tgt.assignment.day4.utils.KeyboardUtil;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Assignment18 {

    static Scanner sc=new Scanner(System.in);
    ContactsDao dao;

    public static void main(String[] args) {
        new Assignment18().start();
    }

    private void start() {
        dao = new ArrayListContactDao();
        int choice;

        while ((choice = menu()) != 0) {
            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    listAllContacts();
                    break;
                case 3:
                    System.out.println("Searching by id; TBD");
                    break;
                case 4:
                    System.out.println("Search by date of birth range");
                    break;
                case 5:
                    System.out.println("Update; TBD");
            }
        }

        System.out.println("Bye!");
    }

    void line(char pattern) {
        for (int i = 1; i <= 80; i++) {
            System.out.print(pattern);
        }
        System.out.println();
    }

    private void addNewContact() {
        try {
            Integer id = KeyboardUtil.getInt("Enter id : ");
            String firstname = KeyboardUtil.getString("Enter first name : ");
            String lastname = KeyboardUtil.getString("Enter last name : ");
            System.out.println("Select gender: 1-MALE  2-FEMALE");
            Gender gender=Gender.MALE;
            int choice=sc.nextInt();
            switch (choice){
                case 1: gender=Gender.MALE;
                        break;
                case 2:gender=Gender.FEMALE;
                        break;
                default:
                    System.out.println("Invalid gender choice");
            }
            String email = KeyboardUtil.getString("Enter email : ");
            String phone = KeyboardUtil.getString("Enter phone number : ");
            String address = KeyboardUtil.getString("Enter address : ");
            String city = KeyboardUtil.getString("Enter city : ");
            String state = KeyboardUtil.getString("Enter state : ");
            Integer pincode = KeyboardUtil.getInt("Enter pincode : ");
            String country = KeyboardUtil.getString("Enter country : ");
            Date dob = KeyboardUtil.getDate("Enter date : ");
            Contact c = new Contact(id,firstname,lastname,gender,email,phone,address,city,state,pincode,country,dob);
            dao.addContact(c);
            System.out.println("New contact added successfully!");
        }
        catch(Exception e){
            System.out.println("There was a problem while adding the contact details.");
            System.out.println(e.getMessage());
        }
    }

    private void listAllContacts() {
        try {
            List<Contact> list = dao.getContacts();
            line('=');
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n","ID","FirstName","LastName","Gender","Email","PhoneNo","Address","City","State","Pincode","Country","DOB");
            line('=');
            for (Contact c : list) {
                System.out.printf("%-10d %-10s %10s -10s %-10s %10s -10s %-10s %10s %-10d %10s -10s \n", c.getId(), c.getFirstname(),c.getLastname(),c.getGender(),c.getEmail(),c.getPhone(),c.getAddress(),c.getCity(),c.getState(),c.getPincode(),c.getCountry(),c.getBirthDate() );
            }
            line('-');
        } catch (DaoException e) {
            System.out.println("There was a problem");
        }
    }

    int menu() {
        line('.');
        int choice = -1;
        do {
            System.out.println("Please choose from the below set of options:\n"+
                    "1. Add new contact\n" +
                    "2. List all contacts\n" +
                    "3. Search by last name\n" +
                    "4. Search by email address\n" +
                    "5. Search by phone number\n" +
                    "6. Search by city\n" +
                    "7. Search by date of birth range\n" +
                    "8. Delete a contact\n" +
                    "9. Edit a contact\n");
            try {
                choice = KeyboardUtil.getInt("Enter your choice: ");
                if (choice < 0 || choice > 10) {
                    System.out.println("Invalid choice, please retry!");
                }
            } catch (Exception e) {
                System.out.println("Invalid choice, please retry!");
            }
        } while (choice < 0 || choice > 10);
        return choice;
    }
}
