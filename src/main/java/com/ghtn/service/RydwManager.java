package com.ghtn.service;

import com.ghtn.vo.RydwVO;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

/**
 * User: Administrator
 * Date: 14-3-18
 * Time: 上午10:13
 */
public interface RydwManager extends GenericManager {

    List<RydwVO> getInMinePeopleSqlServerDataSource4(String date, HttpSession session, Integer start, Integer limit) throws SQLException;

}
