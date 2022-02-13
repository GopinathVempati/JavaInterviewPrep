package inheritence;

import inheritence.isa.Accountant;
import inheritence.isa.Employee;
import inheritence.isa.SalesAgent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*ChildClass childClass = new ChildClass();
        childClass.sayHello();
        ChildClass childClass1 = new ChildClass();
        childClass1.sayBye();
        childClass1.sayHello();*/

        /*Employee employee = new Employee();
        employee.setSalary(100000.0);
        employee.setName("Gopinath");
        System.out.println(employee.getName());

        Accountant accountant = new Accountant();
        accountant.setSalary(15000.0);
        accountant.setName("Gopinath");

        System.out.println(accountant.getSalary()+" "+ accountant.getName());
        System.out.println(accountant.getNoOfLeaves());
        SalesAgent salesAgent = new SalesAgent();
        System.out.println(salesAgent.getNoOfLeaves());*/
        ParentClass pc = new ChildClass();
        System.out.println(pc.value +" "+ pc.getValue());
    }
}
