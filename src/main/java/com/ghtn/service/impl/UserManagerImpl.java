package com.ghtn.service.impl;

import com.ghtn.dao.PersonDao;
import com.ghtn.dao.UserDao;
import com.ghtn.model.oracle.Person;
import com.ghtn.model.oracle.SfUser;
import com.ghtn.service.RoleManager;
import com.ghtn.service.UserManager;
import com.ghtn.util.KeyUtil;
import com.ghtn.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-1
 * Time: 上午10:12
 * To change this template use File | Settings | File Templates.
 */
@Service("userManager")
public class UserManagerImpl extends GenericManagerImpl<SfUser, Long> implements UserManager {

    private UserDao userDao;

    @Autowired
    public UserManagerImpl(UserDao userDao) {
        super(userDao);
        this.userDao = userDao;
    }

    private PersonDao personDao;

    @Resource
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    private RoleManager roleManager;

    @Resource
    public void setRoleManager(RoleManager roleManager) {
        this.roleManager = roleManager;
    }

    @Override
    public String loginOracleDataSource3(String userName, String password, HttpSession session) {
        if (!StringUtil.isNullStr(userName) && !StringUtil.isNullStr(password)) {
            SfUser user = userDao.getUserByName(userName);
            if (user != null && user.getPassword().equals(KeyUtil.encryptByMD5(password))) {
                Person person = personDao.getPerson(userName);

                List<Integer> levelList = roleManager.getRoleLevelOracleDataSource3(user.getUserid().intValue());
                String roleLevel = "";
                if (levelList != null) {
                    if (levelList.size() > 1) {
                        if (levelList.contains(1)) {
                            roleLevel = "1";
                        } else {
                            roleLevel = "2";
                        }
                    } else {
                        roleLevel = levelList.get(0).toString();
                    }
                }

                String mainDeptId;
                if (StringUtil.isNullStr(person.getUsingdept())) {
                    mainDeptId = person.getMaindeptid();
                } else {
                    mainDeptId = person.getUsingdept();
                }

                Map<String, String> userMap = new HashMap<>();
                userMap.put("personNumber", userName);
                userMap.put("personName", person.getName());
                userMap.put("roleLevel", roleLevel);
                userMap.put("mainDeptId", mainDeptId);
                session.setAttribute("user", userMap);
                return "success";
            }
        }

        return "error";
    }
}
