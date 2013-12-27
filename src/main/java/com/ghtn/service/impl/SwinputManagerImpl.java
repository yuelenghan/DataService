package com.ghtn.service.impl;

import com.ghtn.dao.SwinputDao;
import com.ghtn.model.oracle.fxyk.Getswinput;
import com.ghtn.service.SwinputManager;
import com.ghtn.vo.SwinputVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:08
 */
@Service("swinputManager")
public class SwinputManagerImpl extends GenericManagerImpl<Getswinput, Integer>
        implements SwinputManager {

    private SwinputDao swinputDao;

    @Autowired
    public SwinputManagerImpl(SwinputDao swinputDao) {
        super(swinputDao);
        this.swinputDao = swinputDao;
    }

    @Override
    public List<SwinputVO> listSwinputOracleDataSource3(Integer typeId) {
        List<Getswinput> list = swinputDao.listSwinput(typeId);
        List<SwinputVO> returnList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (Getswinput getswinput : list) {
                returnList.add(transformToVO(getswinput));
            }
        }

        return returnList;
    }

    /**
     * 把实体类转换为VO
     *
     * @param getswinput 实体类
     * @return vo
     */
    private SwinputVO transformToVO(Getswinput getswinput) {
        SwinputVO swinputVO = new SwinputVO();

        swinputVO.setSwinputid(getswinput.getSwinputid());
        swinputVO.setRemarks(getswinput.getRemarks());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        swinputVO.setPctime(getswinput.getPctime() == null ? "" : sdf.format(getswinput.getPctime()));

        swinputVO.setBanci(getswinput.getBanci());

        int jctype = getswinput.getJctype() == null ? 0 : getswinput.getJctype().intValue();
        swinputVO.setJctype(jctype);
        switch (jctype) {
            case 1:
                swinputVO.setJctypeDesc("区队自查");
                break;
            case 2:
                swinputVO.setJctypeDesc("职能科室");
                break;
            case 3:
                swinputVO.setJctypeDesc("安监部门");
                break;
            case 4:
                swinputVO.setJctypeDesc("矿领导");
                break;
            case 5:
                swinputVO.setJctypeDesc("公司部室");
                break;
            default:
                swinputVO.setJctypeDesc("区队自查");
        }

        if (getswinput.getIslearn() == null) {
            swinputVO.setIslearn("不进班");
        } else if (getswinput.getIslearn().intValue() == 1) {
            swinputVO.setIslearn("进班");
        } else if (getswinput.getIslearn().intValue() == 2) {
            swinputVO.setIslearn("退班");
        }

        swinputVO.setStatus(getswinput.getStatus());
        swinputVO.setSwpname(getswinput.getSwpname());
        swinputVO.setPcpname(getswinput.getPcpname());
        swinputVO.setPlacename(getswinput.getPlacename());
        swinputVO.setSwcontent(getswinput.getSwcontent());
        swinputVO.setTypename(getswinput.getTypename());
        swinputVO.setLevelname(getswinput.getLevelname());
        swinputVO.setMaindeptname(getswinput.getMaindeptname());
        swinputVO.setZrkqname(getswinput.getZrkqname());
        swinputVO.setZyname(getswinput.getZyname());
        swinputVO.setIsfine(getswinput.getIsfine().intValue() == 0 ? "不罚款" : "罚款");
        swinputVO.setPcpnameNow(getswinput.getPcpnameNow());

        return swinputVO;
    }
}
