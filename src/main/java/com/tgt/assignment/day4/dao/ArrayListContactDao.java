package com.tgt.assignment.day4.dao;

import com.tgt.assignment.day4.entity.Contact;
import com.tgt.assignment.day4.entity.Gender;
import com.tgt.assignment.day4.exception.DaoException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListContactDao implements ContactsDao{

    private List<Contact> contacts=new ArrayList<>();
    public ArrayListContactDao(){
//        contacts.add(new Contact(2,"Vinod","Kumar",Gender.MALE,"vinod@gmail.com","9797470967","Jayanagar","Mysore","Karnataka",590064,"India",);
//        contacts.add(new Contact(1,"Arpitha","KV", Gender.FEMALE,"arpitha@gmail.com","9876601314","Vijaynagar","Hassan","Karnataka",570084,"India",);
//        contacts.add(new Contact(1,"Pragathi","MI", Gender.FEMALE,"pragathi@gmail.com","8197670998","Hebbal","Bangalore","Karnataka",560024,"India",);
    }

    @Override
    public void addContact(Contact contact) throws DaoException {
        if(contact.getId()<=0) throw new DaoException("Please provide a valid ID");
        if(contact.getFirstname()==null||contact.getLastname()==null||contact.getFirstname().trim().length()==0||contact.getLastname().trim().length()==0) throw new DaoException("Please enter a valid name");
        if(contact.getPhone().length()!=10) throw new DaoException("Please provide a valid 10 digit phone number");
        if(contact.getAddress()==null||contact.getAddress().trim().length()==0) throw new DaoException("Please provide the address");
        if(contact.getCity()==null||contact.getCity().trim().length()==0) throw new DaoException("Please provide a valid city name");
        if(contact.getState()==null||contact.getState().trim().length()==0) throw new DaoException("Please provide a valid state name");
        if(contact.getCountry()==null||contact.getCountry().trim().length()==0) throw new DaoException("Please provide a valid country name");
        if(contact.getPincode()<=0) throw new DaoException("Please provide a valid pincode");
        contacts.add(contact);
    }

    @Override
    public Optional<Contact> getContact(Integer id) throws DaoException {
        Optional<Contact> c=contacts.stream().filter(contact->contact.getId()==id).findAny();
        if(c==null) throw new DaoException("ID not found");
        else return c;
    }

    @Override
    public void updateContact(Contact contact) throws DaoException {

    }

    @Override
    public void deleteContact(Integer id) throws DaoException {

    }

    @Override
    public Contact getContactByEmail(String email) throws DaoException {
        return (Contact) contacts.stream().filter(contact -> contact.getEmail()==email).collect(Collectors.toList());
    }

    @Override
    public List<Contact> getContactByPhone(String phone) throws DaoException {
        return  contacts.stream().filter(contact -> contact.getPhone()==phone).collect(Collectors.toList());
    }

    @Override
    public List<Contact> getContactsByLastname(String lastname) throws DaoException {
        return contacts.stream().filter(contact -> contact.getLastname().equals(lastname)).collect(Collectors.toList());
    }

    @Override
    public List<Contact> getContactsByCity(String city) throws DaoException {
        return contacts.stream().filter(contact -> contact.getCity()==city).collect(Collectors.toList());
    }

    @Override
    public List<Contact> getContacts() throws DaoException {
        return this.contacts;
    }

    @Override
    public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException {
        return contacts.stream().filter(contact -> contact.getBirthDate().after(from) && contact.getBirthDate().before(to)).collect(Collectors.toList());
    }
}
