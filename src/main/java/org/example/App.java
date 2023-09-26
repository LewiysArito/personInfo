package org.example;


import personInfo.DataPerson;
import personInfo.Jobs;
import personInfo.Supervisers;
import personInfo.Clients;

public class App {
    public static void main(String[] args) {
        int N = 10;
        DataPerson[] persons = new DataPerson[N];
        persons[0] = new Clients("Касимов Никита Сергеевич", 2000, "89185746993", "Космонавтов 10/1");
        persons[1] = new Jobs("Чукавова Елизавета Евгеньевна", 2001, "89286035690", "Космонавтов 10/1", 10);
        persons[2] = new Jobs("Дмитриев Василий Васильевич", 1991, "89286035656", "Космонавтов 1/1", 15);
//        for(DataPerson person : persons){
//                System.out.println(person.getFIO());
//  }


        for (DataPerson person : persons) {
            if (person != null) {
                System.out.println(person.getFIO());
            }
        }


        //работает с теми полями, которые наследуются от общего класса
        //однако в jobs и в supervisers
        for (DataPerson person : persons) {
            if (person instanceof Supervisers) {
                System.out.println(((Supervisers) person).getSubdivision());
            } else if (person instanceof Jobs) {
                System.out.println(((Jobs) person).getSubdivision());
            }
        }
        System.out.println(DataPerson.PersonCount.getClients() + " " + DataPerson.PersonCount.getEmployees());
    }
}
