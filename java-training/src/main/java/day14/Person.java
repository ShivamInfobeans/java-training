package day14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private String id;
    // Field Injection
//    @Autowired
    private Address address;

    public Person() {
        name="name-1";
        id="id-1";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        System.out.println("Setter for Person getting called");
        this.address = address;
    }
}
