package com.company;

public class Contact {
    String name;
    String surname;
    String phone;
    Group group;

    public Contact(String name, String surname, String phone, Group group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Контакты" + " Имя:" + name + " Фамилия:" + surname + " Номер телефона:" + phone + " группа:" + group;
    }
}
