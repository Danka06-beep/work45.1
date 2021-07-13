package com.company;

public class MissedCalls {
    String phone;

    public MissedCalls(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Номер " + phone;
    }
}
