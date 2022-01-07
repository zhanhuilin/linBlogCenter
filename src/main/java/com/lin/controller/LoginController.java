package com.lin.controller;

import com.lin.entity.ResultData;
import com.lin.entity.input.LoginEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhanhuilin
 * @date 2021/12/15 - 16:27
 */
@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultData login(@RequestBody LoginEntity loginEntity) {
      ResultData resultData = new ResultData("0","登录成功！");

      return resultData;
    }
}
