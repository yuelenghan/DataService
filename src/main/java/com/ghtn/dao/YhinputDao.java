package com.ghtn.dao;

import com.ghtn.model.oracle.fxyk.Getyhinput;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-4
 * Time: 下午3:46
 * To change this template use File | Settings | File Templates.
 */
public interface YhinputDao extends GenericDao<Getyhinput, Integer> {

    List<Getyhinput> listYhinput(Integer typeId);
}
