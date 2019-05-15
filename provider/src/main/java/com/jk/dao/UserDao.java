package com.jk.dao;

import com.jk.model.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface UserDao {

    List<NavBean> findNavList();

    @Select("select count(1) from t_user")
    int findBookscount(HashMap<String, Object> map);

    List<UserBean> findBooksList(HashMap<String, Object> map);

    void addUser(UserBean userBean);

    void saveUserRole(ArrayList<UserRoleBean> arrayList);
    @Update("update t_user u set u.name=#{name},u.age=#{age},u.city_id=#{cityId},u.dept_id=#{deptId},u.head_img=#{headImg},u.province_id=#{provinceId},"
            + "u.sex=#{sex} where u.id=#{id}")

    void updateUser(UserBean userBean);

    @Delete("delete from t_user_role where userid=#{value}")
    void deleteRoleUserId(Integer id);

    @Select("select group_concat(tur.roleid) as" + "		roleId,u.id,u.name,u.age,u.sex,u.head_img as"
            + "		headImg,u.city_id as cityId,u.dept_id as deptId ,u.province_id as provinceId from t_user u"
            + "		left join t_user_role tur on u.id = tur.userId where u.id=#{value}" + "		group by u.id 	")
    UserBean findUserById(Integer id);

    @Select("select id,name as text,pid from t_dept where pid = #{value}")
    List<DeptBean> findDeptNode(Integer id);

    void deleteUser(Integer[] ids);

    @Select("select * from t_area where pid = #{value}")
    List<AreaBean> findArea(Integer id);

    @Insert("insert into t_menu(name,path,powerId,remark) values (#{name},#{path},#{powerId},#{remark})")
    void savePowerMenu(PowerMenuBean powerMenuBean);

    void removePower(ArrayList<Integer> powers);

    @Select("select id from t_nav where pid=#{value}")
    List<Integer> findPowerId(Integer id);

    @Insert("insert into t_nav (text,url,pid) values(#{text},#{url},#{pid})")
    void savePower(NavBean navBean);

    @Select("select * from t_role")
    List<RoleBean> findRoleList();

    void addRole(RoleBean roleBean);

    @Select("select * from t_nav ")
    List<NavBean> findNavTreeCommon();

    @Select("select powerId from t_role_power where roleId=#{value}")
    List<RolePowerBean> findRolePower(Integer roleId);

    @Delete("delete from t_role_power where roleID=#{value}")
    void delRolePowerByid(Integer roleID);

    void saveRolePower(ArrayList<RolePowerBean> arrayList);

    void deleteRole(Integer[] ids);

    @Select("select * from t_menu where powerId = #{value}")
    List<PowerMenuBean> findpowerMenu(Integer powerId);


    UserBean getUserInfoByLoginNumber(UserBean userBean);
}
