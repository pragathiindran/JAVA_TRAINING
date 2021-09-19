package com.tgt.assignment.day4.dao;

import com.tgt.assignment.day4.entity.Contact;
import com.tgt.assignment.day4.exception.DaoException;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ContactsDao {

        // CRUD operations
        public void addContact(Contact contact) throws DaoException;
        public Optional<Contact> getContact(Integer id) throws DaoException;
        public void updateContact(Contact contact) throws DaoException;
        public void deleteContact(Integer id) throws DaoException;

        // Queries
        public Contact getContactByEmail(String email) throws DaoException;
        public List<Contact> getContactByPhone(String phone) throws DaoException;
        public List<Contact> getContactsByLastname(String lastname) throws DaoException;
        public List<Contact> getContactsByCity(String city) throws DaoException;
        public List<Contact> getContacts() throws DaoException;
        public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException;
}