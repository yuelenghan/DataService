package com.ghtn.service.impl;

import com.ghtn.dao.YhinputDao;
import com.ghtn.model.oracle.fxyk.Getyhinput;
import com.ghtn.service.YhinputManager;
import com.ghtn.vo.YhinputVO;
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
@Service("yhinputManager")
public class YhinputManagerImpl extends GenericManagerImpl<Getyhinput, Integer>
        implements YhinputManager {

    private YhinputDao yhinputDao;

    @Autowired
    public YhinputManagerImpl(YhinputDao yhinputDao) {
        super(yhinputDao);
        this.yhinputDao = yhinputDao;
    }

    @Override
    public List<YhinputVO> listYhinputOracleDataSource3(Integer typeId, Integer start, Integer limit) {
        if (start == null) start = 0;
        if (limit == null) limit = 15;

        List<Getyhinput> list = yhinputDao.listYhinput(typeId, start, limit);
        List<YhinputVO> returnList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (Getyhinput getyhinput : list) {
                returnList.add(transformToVO(getyhinput));
            }
        }

        return returnList;
    }

    @Override
    public YhinputVO getYhinputOracleDataSource3(Integer id) {
        if (id != null && id > 0) {
            return transformToVO(yhinputDao.get(id));
        }
        return null;
    }

    /**
     * 把实体类转换为VO
     *
     * @param getyhinput 实体类
     * @return vo
     */
    private YhinputVO transformToVO(Getyhinput getyhinput) {
        YhinputVO yhinputVO = new YhinputVO();
        yhinputVO.setYhputinid(getyhinput.getYhputinid());
        yhinputVO.setBanci(getyhinput.getBanci());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        yhinputVO.setPctime(getyhinput.getPctime() == null ? "" : sdf.format(getyhinput.getPctime()));
        yhinputVO.setIntime(getyhinput.getIntime() == null ? "" : sdf2.format(getyhinput.getIntime()));

        yhinputVO.setRemarks(getyhinput.getRemarks());
        yhinputVO.setStatus(getyhinput.getStatus());

        int jctype = getyhinput.getJctype() == null ? 0 : getyhinput.getJctype();
        yhinputVO.setJctype(jctype);
        switch (jctype) {
            case -6:
                yhinputVO.setJctypeDesc("采掘专项检查");
                break;
            case -5:
                yhinputVO.setJctypeDesc("火工品专项检查");
                break;
            case -4:
                yhinputVO.setJctypeDesc("机电运输专项检查");
                break;
            case -3:
                yhinputVO.setJctypeDesc("地测防治水专项检查");
                break;
            case -2:
                yhinputVO.setJctypeDesc("一通三防专项检查");
                break;
            case -1:
                yhinputVO.setJctypeDesc("顶板管理专项检查");
                break;
            case 0:
                yhinputVO.setJctypeDesc("重大安全隐患");
                break;
            case 1:
                yhinputVO.setJctypeDesc("年度隐患");
                break;
            case 2:
                yhinputVO.setJctypeDesc("月度隐患");
                break;
            case 3:
                yhinputVO.setJctypeDesc("日常动态检查隐患");
                break;
            case 4:
                yhinputVO.setJctypeDesc("矿专项检查");
                break;
            case 5:
                yhinputVO.setJctypeDesc("地面检查");
                break;
            case 6:
                yhinputVO.setJctypeDesc("职工检查");
                break;
            case 7:
                yhinputVO.setJctypeDesc("公司专项检查");
                break;
            case 8:
                yhinputVO.setJctypeDesc("省局检查");
                break;
            case 9:
                yhinputVO.setJctypeDesc("市局检查");
                break;
            case 10:
                yhinputVO.setJctypeDesc("国投检查");
                break;
            case 11:
                yhinputVO.setJctypeDesc("经信委检查");
                break;
            case 12:
                yhinputVO.setJctypeDesc("公司预评估");
                break;
            default:
                yhinputVO.setJctypeDesc("重大安全隐患");
        }

        yhinputVO.setXqdate(getyhinput.getXqdate() == null ? "" : sdf.format(getyhinput.getXqdate()));
        yhinputVO.setXqbanci(getyhinput.getXqbanci());
        yhinputVO.setZrdeptname(getyhinput.getZrdeptname());
        yhinputVO.setPlacename(getyhinput.getPlacename());
        yhinputVO.setYhcontent(getyhinput.getYhcontent());
        yhinputVO.setZrpername(getyhinput.getZrpername());
        yhinputVO.setTypename(getyhinput.getTypename());
        yhinputVO.setLevelname(getyhinput.getLevelname());
        yhinputVO.setMaindeptname(getyhinput.getMaindeptname());
        yhinputVO.setYqcs(getyhinput.getYqcs() + "");
        yhinputVO.setIsfine(getyhinput.getIsfine().intValue() == 0 ? "不罚款" : "罚款");

        return yhinputVO;
    }
}
