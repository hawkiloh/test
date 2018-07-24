package com.hql.action;

import com.hql.bean.Person;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class personAction extends ActionSupport implements ModelDriven<Person> {

    private Person person;

    public void test(){
        System.out.println("testAction");
        System.out.println(person);
    }

//    @Override
//    public String execute() throws Exception {
//        System.out.println("execute method");
//        return super.execute();
//    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public Person getModel() {
        return person;
    }
}
