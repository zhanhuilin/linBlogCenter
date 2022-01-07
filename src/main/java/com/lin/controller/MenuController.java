package com.lin.controller;

import com.lin.entity.ResultData;
import com.lin.entity.input.LoginEntity;
import com.lin.entity.input.MenuEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author zhanhuilin
 * @date 2021/12/15 - 16:27
 */

@Controller
public class MenuController {

    @ResponseBody
    @RequestMapping(value = "/getMenuList", method = RequestMethod.POST)
    public ResultData getMenuList() {
        ResultData resultData = new ResultData("0","获取成功！");
        ArrayList<MenuEntity> menuList = new ArrayList<>();

        MenuEntity menuEntity = new MenuEntity();
        menuEntity.setIcon("el-icon-lx-home");
        menuEntity.setIndex("/dashboard");
        menuEntity.setTitle("系统首页");

        menuList.add(menuEntity);

        MenuEntity menuEntity1 = new MenuEntity();
        menuEntity1.setIcon("el-icon-lx-cascades");
        menuEntity1.setIndex("/table");
        menuEntity1.setTitle("基础表格");

        menuList.add(menuEntity1);

        resultData.setData(menuList);

        return resultData;
    }


    /**
     * 新增菜单
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insertMenu", method = RequestMethod.POST)
    public ResultData insertMenu() {

        return null;
    }
}
