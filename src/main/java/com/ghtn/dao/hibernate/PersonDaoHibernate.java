package com.ghtn.dao.hibernate;

import com.ghtn.dao.PersonDao;
import com.ghtn.model.oracle.Person;
import com.ghtn.util.StringUtil;
import org.hibernate.Criteria;
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
        Person person = getPerson(personNumber);
        if (person != null) {
            return person.getName();
        }
        return "";
    }

    @Override
    public List<Person> getPerson(String shortName, String deptId) {
        Criteria c = getSession().createCriteria(Person.class);
        if (!StringUtil.isNullStr(deptId)) {
            c.add(Restrictions.eq("deptid", deptId));
        }
        if (!StringUtil.isNullStr(shortName)) {
            c.add(Restrictions.or(Restrictions.like("name", "%" + shortName + "%"), Restrictions.like("pinyin", "%" + shortName.toUpperCase() + "%")));
        }
        return c.setFirstResult(0).setMaxResults(50).list();
    }

    @Override
    public Person getPerson(String personNumber) {
        return (Person) getSession().createCriteria(Person.class).add(Restrictions.eq("personnumber", personNumber)).uniqueResult();
    }
}
