package com.ghtn.dao.hibernate;

import com.ghtn.dao.GasDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihe on 14/8/7.
 */
@Repository("gasDao")
public class GasDaoHibernate extends GenericDaoHibernate implements GasDao {

    public GasDaoHibernate() {
    }

    @Override
    public List<Object[]> getCOData(String deptName, int start, int limit) {
        String sql = "SELECT  分站,  类型, 描述, 值 from 模拟量显示";
        sql += " WHERE (矿名 = '" + deptName + "') AND ((类型 = 2) or   (类型 = 4) )  ";
        return querySql(sql, start, limit);
    }

    @Override
    public List<Object[]> getEquipData(String deptName, int start, int limit) {
        String sql = "SELECT 矿名, 分站, 序号, 类型, 描述, 值, 时间 FROM 开关量显示 WHERE (类型 = 1)";
        return querySql(sql, start, limit);
    }
}
