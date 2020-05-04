package org.example;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class DbService {

    @PersistenceContext
    private EntityManager entityManager;

    public void persistPerson(String name) {
        Person person = new Person();
        person.setName(name);
        entityManager.persist(person);
    }

    public List<Person> getPersons() {
        Query query = entityManager.createQuery("select p from Person p");
        return query.getResultList();
    }
}
