package com.ghtn.dao;

import com.ghtn.model.sqlServer.Xsrb;

import java.util.Date;
import java.util.List;

/**
 * Created by lihe on 14/8/8.
 */
public interface OutPutDao extends GenericDao {

    List<Xsrb> getOutPutData(Date startDate, Date endDate);

}
