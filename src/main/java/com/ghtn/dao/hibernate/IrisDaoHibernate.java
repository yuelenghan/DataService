package com.ghtn.dao.hibernate;

import com.ghtn.dao.IrisDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14-6-3.
 */
@Repository("irisDao")
public class IrisDaoHibernate extends GenericDaoHibernate implements IrisDao {
    @Override
    public List<Object[]> getIrisData(String personNumber) {
        StringBuilder sql = new StringBuilder();
        sql.append("select * from v_aq_attend_record")
                .append(" where worker_sn = '" + personNumber + "'")
                .append(" order by in_well_time desc");

        return querySql(sql.toString());
    }
}
