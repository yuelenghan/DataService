package com.ghtn.dao.hibernate;

import com.ghtn.dao.BaseInfoDao;
import com.ghtn.model.oracle.fxyk.CsBaseinfoset;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:06
 */
@Repository("baseInfoDao")
public class BaseInfoDaoHibernate extends GenericDaoHibernate<CsBaseinfoset, Integer> implements BaseInfoDao {
    public BaseInfoDaoHibernate() {
        super(CsBaseinfoset.class);
    }

    @Override
    public List<CsBaseinfoset> listBaseInfo() {
        return getSession().createCriteria(CsBaseinfoset.class).setCacheable(true).list();
    }

    @Override
    public List<CsBaseinfoset> listBaseInfoByFid(Integer fid) {
        return getSession().createCriteria(CsBaseinfoset.class).setCacheable(true)
                .add(Restrictions.eq("fid", fid)).list();
    }
}
