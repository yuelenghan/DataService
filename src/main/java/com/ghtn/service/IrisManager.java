package com.ghtn.service;

import com.ghtn.vo.IrisVO;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

/**
 * 读取虹膜数据
 * Created by lihe on 14-6-3.
 */
public interface IrisManager extends GenericManager {

    List<IrisVO> getIrisDataMysqlDataSource5(String personNumber, HttpSession session) throws ParseException;

}
