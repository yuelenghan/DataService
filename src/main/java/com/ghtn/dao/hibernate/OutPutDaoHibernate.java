package com.ghtn.dao.hibernate;

import com.ghtn.dao.OutPutDao;
import com.ghtn.model.sqlServer.Xsrb;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by lihe on 14/8/8.
 */
@Repository("outPutDao")
public class OutPutDaoHibernate extends GenericDaoHibernate implements OutPutDao {
    @Override
    public List<Xsrb> getOutPutData(Date startDate, Date endDate) {
      /*  String sql = "SELECT cast(id as varchar), cast(yd_name as varchar) AS 用户名, cast(yd_content as varchar) AS 内容, cast(yd_dw as varchar) AS 部门";
        sql += " FROM xsrb";
        sql += " WHERE (yd_dt1 > '" + startDate + "') AND (yd_dt1 < '" + endDate + "')";*/

        return getSession().createCriteria(Xsrb.class)
                .add(Restrictions.between("yd_dt1", startDate, endDate))
                .addOrder(Order.desc("yd_dt1"))
                .list();
    }
}
