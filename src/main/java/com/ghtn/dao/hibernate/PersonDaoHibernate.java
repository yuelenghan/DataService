package com.ghtn.dao.hibernate;

import com.ghtn.dao.PersonDao;
import com.ghtn.model.oracle.Person;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 2014/4/3
 * Time: 11:14
 */
@Repository("personDao")
public class PersonDaoHibernate extends GenericDaoHibernate<Person, Long> implements PersonDao {

    public PersonDaoHibernate() {
        super(Person.class);
    }

    @Override
    public String getPersonName(String personNumber) {
        Person person = (Person) getSession().createCriteria(Person.class).add(Restrictions.eq("personnumber", personNumber)).uniqueResult();
        if (person != null) {
            return person.getName();
        }
        return "";
    }

    @Override
    public List<Person> getPerson(String shortName, String mainDeptId) {
        return getSession().createCriteria(Person.class)
                .add(Restrictions.eq("maindeptid", mainDeptId))
                .add(Restrictions.like("name", "%" + shortName + "%")).list();
    }
}
