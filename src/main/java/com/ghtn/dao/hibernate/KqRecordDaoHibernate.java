package com.ghtn.dao.hibernate;

import com.ghtn.dao.KqRecordDao;
import com.ghtn.model.oracle.KqRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:06
 */
@Repository("kqRecordDao")
public class KqRecordDaoHibernate extends GenericDaoHibernate<KqRecord, Integer> implements KqRecordDao {
    public KqRecordDaoHibernate() {
        super(KqRecord.class);
    }

    @Override
    public List<Object[]> listKqRecord(Integer typeId, Integer start, Integer limit) {
        String hql = " select r, p.name from KqRecord r, Person p"
                + " where r.kqpnumber = p.personnumber and r.kqtype = " + typeId
                + " order by r.id desc ";
        return getSession().createQuery(hql).setCacheable(true)
                .setFirstResult(start).setMaxResults(limit).list();
    }

    @Override
    public Object[] getKqRecord(Integer id) {
        String hql = " select r, p.name from KqRecord r, Person p"
                + " where r.kqpnumber = p.personnumber and r.id = " + id;
        return (Object[]) getSession().createQuery(hql).setCacheable(true).uniqueResult();
    }
}
