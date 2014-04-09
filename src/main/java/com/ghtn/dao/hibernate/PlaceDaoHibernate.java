package com.ghtn.dao.hibernate;

import com.ghtn.dao.PlaceDao;
import com.ghtn.model.oracle.Place;
import org.springframework.stereotype.Repository;

/**
 * User: Administrator
 * Date: 2014/4/8
 * Time: 10:17
 */
@Repository("placeDao")
public class PlaceDaoHibernate extends GenericDaoHibernate<Place, Integer> implements PlaceDao {

    public PlaceDaoHibernate() {
        super(Place.class);
    }

}
