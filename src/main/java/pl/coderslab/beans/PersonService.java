package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private PersonRepository personRepo;

    public PersonService(@Qualifier("personRepo") PersonRepository personRepository) {
        this.personRepo = personRepository;
    }

    public PersonRepository getPersonRepo() {
        return personRepo;
    }
}
