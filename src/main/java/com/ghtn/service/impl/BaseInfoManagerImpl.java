package com.ghtn.service.impl;

import com.ghtn.dao.BaseInfoDao;
import com.ghtn.model.oracle.fxyk.CsBaseinfoset;
import com.ghtn.service.BaseInfoManager;
import com.ghtn.vo.BaseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 下午4:08
 */
@Service("baseInfoManager")
public class BaseInfoManagerImpl extends GenericManagerImpl<CsBaseinfoset, Integer>
        implements BaseInfoManager {

    private BaseInfoDao baseInfoDao;

    @Autowired
    public BaseInfoManagerImpl(BaseInfoDao baseInfoDao) {
        super(baseInfoDao);
        this.baseInfoDao = baseInfoDao;
    }

    @Override
    public List<BaseInfoVO> listBaseInfoOracleDataSource3() {
        List<CsBaseinfoset> list = baseInfoDao.listBaseInfo();
        List<BaseInfoVO> returnList = new ArrayList<>();

        if (list != null && list.size() > 0) {
            for (CsBaseinfoset csBaseinfoset : list) {
                returnList.add(transformToVO(csBaseinfoset));
            }
        }

        return returnList;
    }

    /**
     * 把实体类转换为VO
     *
     * @param csBaseinfoset 实体类
     * @return vo
     */
    private BaseInfoVO transformToVO(CsBaseinfoset csBaseinfoset) {
        BaseInfoVO baseInfoVO = new BaseInfoVO();
        baseInfoVO.setInfoid(csBaseinfoset.getInfoid());
        baseInfoVO.setInfocode(csBaseinfoset.getInfocode());
        baseInfoVO.setInfoname(csBaseinfoset.getInfoname());

        return baseInfoVO;
    }
}
