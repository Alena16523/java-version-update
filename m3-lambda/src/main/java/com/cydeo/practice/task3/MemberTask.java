package com.cydeo.practice.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTask {
    public static void main(String[] args) {

        Person p1=new Person("mike", 35, Gender.MALE);
        Person p2=new Person("alena", 28, Gender.FEMALE);
        Person p3=new Person("ozzy", 18, Gender.MALE);
        Person p4=new Person("tom", 60, Gender.MALE);

        List<Person> personList= Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember=p->p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25;
        print(personList, checkMember);

        // print(personList,  p->p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge()<=25 );



    }

    private static void print(List<Person> personList,CheckMember checkmember){
        List<Person> result=new ArrayList<>();

        for (Person person : personList) {
            if(checkmember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }

}
