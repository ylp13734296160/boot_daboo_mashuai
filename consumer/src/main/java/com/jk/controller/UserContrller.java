package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.*;
import com.jk.service.UserService;
import com.jk.util.EasyuiPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserContrller {
    @Reference(version = "1.0.0")
    private UserService userService;
    @RequestMapping("findNav")
    public List<NavBean>findNavList(){
         List<NavBean>findNavList  = userService.findNavList();
        return findNavList;
    }
    @RequestMapping("sel")
    public EasyuiPage findUser(UserBean userBean, Integer page, Integer rows) {
        return userService.findUser(userBean, page, rows);
    }
    @RequestMapping("add")
    private Boolean addUser(UserBean userBean) {
        try {
            if (userBean.getId() != null) {
                userService.updateUser(userBean);
            } else {
                userService.addUser(userBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    @RequestMapping("deleteuser")
    public Boolean deleteUser(Integer[] ids) {
        try {
            userService.deleteUser(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("findUserById")
    public UserBean findUserById(Integer id) {
        return userService.findUserById(id);
    }
    @RequestMapping("findDeptList")
    public List<DeptBean> findDeptList() {
        return userService.findDeptList();
    }
    @RequestMapping("findArea")
    public List<AreaBean> findArea(Integer id) {
        return userService.findArea(id);
    }
    @RequestMapping("savePowerMenu")
    public Boolean savePowerMenu(PowerMenuBean powerMenuBean) {
        try {
            userService.savePowerMenu(powerMenuBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    @RequestMapping("removePower")
    public Boolean  removePower(Integer id) {
        try {
            userService.removePower(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    @RequestMapping("savePower")
    public Boolean savePower(NavBean navBean) {
        try {
            userService.savePower(navBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @RequestMapping("findRoleList2")
    public List<RoleBean> findRoleList2() {
        return userService.findRoleList2();

    }
    @RequestMapping("addRole")
    public Boolean addRole(RoleBean roleBean) {
        try {
            userService.addRole(roleBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("findRolePowerTree")
    public List<NavBean> findRolePowerTree(Integer roleId) {
        return userService.findRolePowerTree(roleId);
    }

    @RequestMapping("saveRolePower")
    public Boolean saveRolePower(Integer roleID, Integer[] powerids) {
        try {
            userService.saveRolePower(roleID, powerids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("deleteRole")
    public Boolean deleteRole(Integer[] ids) {
        try {
            userService.deleteRole(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("findpowerMenu")
    public List<PowerMenuBean> findpowerMenu(Integer powerId){
        return userService.findpowerMenu(powerId);
    }


    @RequestMapping("login")
    public HashMap<String, Object> login(UserBean userBean,HttpServletRequest request){
        HashMap<String, Object> result = new HashMap<>();
        System.out.println(11111);
        HttpSession session = request.getSession();
        //通过前台登录账号查询用户信息
        UserBean userInfo = userService.getUserInfoByLoginNumber(userBean);
        //外部webservice接口获取
        //com.jk.fs.service.webservice.UserBean userInfo = userServiceImpl.queryUserInfoLoginNumber(userBean.getLoginNumber());
        if (userInfo == null) {
            result.put("code", 2);
            result.put("msg","账号不存在");
            return result;
        }
        //判断账号状态是否正常
        if(userInfo.getStatus() != 0) {
            result.put("code", 3);
            result.put("msg","账号被锁定，请联系管理员");
            return result;
        }
        //判断密码是否正确
        String password = userBean.getPassword();
        /* String md516 = Md5Util.getMd516(password);
        System.out.println("正确密码"+md516);*/
        if (!userInfo.getPassword().equals(password)) {
            result.put("code", 4);
            result.put("msg","密码错误");
            return result;
        }
        //将用户信息存入到session当中
        session.setAttribute("user",userInfo);
        result.put("code", 0);
        result.put("msg","登录成功");
        return result;
    }

}
