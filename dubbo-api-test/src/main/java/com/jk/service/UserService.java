package com.jk.service;

import com.jk.model.*;
import com.jk.util.EasyuiPage;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<NavBean> findNavList();

   EasyuiPage findUser(UserBean userBean, Integer page, Integer rows);

    void updateUser(UserBean userBean);

    void addUser(UserBean userBean);

    UserBean findUserById(Integer id);

    List<DeptBean> findDeptList();

    void deleteUser(Integer[] ids);

    List<AreaBean> findArea(Integer id);

    void savePowerMenu(PowerMenuBean powerMenuBean);

    void removePower(Integer id);

    void savePower(NavBean navBean);

    List<RoleBean> findRoleList2();

    void addRole(RoleBean roleBean);

    List<NavBean> findRolePowerTree(Integer roleId);

    void saveRolePower(Integer roleID, Integer[] powerids);

    void deleteRole(Integer[] ids);

    List<PowerMenuBean> findpowerMenu(Integer powerId);


    UserBean getUserInfoByLoginNumber(UserBean userBean);
}
