package com.company;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static Map<String, Contact> contacts;
    static Map<LocalDateTime, MissedCalls> missedCalls;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contacts = new HashMap<>();
        missedCalls = new TreeMap<>();
        while (true){
            System.out.println("\nМеню:" + "\n1. Добавить контакт" + "\n2. Добавить пропущенный вызов" + "\n3. Вывести все пропущенные вызовы" + "\n4. Очистить пропущенные вызовы" + "\n5. Выход");
            int id = sc.nextInt();
            sc.nextLine();
                switch (id) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        missedCall();
                        break;
                    case 3:
                        ShowAllMissedCalls();
                        break;
                    case 4:
                        remove();
                        break;
                    default:
                        break;
                }
        }
    }

    private static void addContact() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите имя,фамилию,номер,группу");
            String input = sc.nextLine();
            if(input.equals("end")){
                break;
            }
            String[] inputMass = input.split(", ");
            contacts.put(inputMass[2], new Contact(inputMass[0], inputMass[1], inputMass[2], Group.getEnum(inputMass[3])));
        }

    }

    private static void missedCall() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Добавьте номер пропущенного вызова");
            String missed = sc.nextLine();
            if(missed.equals("end")){
                break;
            }
            LocalDateTime time = LocalDateTime.now();
            String[] inputMass = missed.split(" ");
            missedCalls.put(time, new MissedCalls(inputMass[0]));
        }
    }

    public static void ShowAllMissedCalls() {
        if(missedCalls.isEmpty()){
            System.out.println("Нет пропушеных");
        }
        for (Map.Entry<LocalDateTime, MissedCalls> missedCalls : missedCalls.entrySet()) {
            System.out.println(missedCalls);
        }
    }
    public static void remove(){
        missedCalls.clear();
    }
}


