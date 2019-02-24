package com.blizzard.buy.controller;

import com.blizzard.buy.domain.Employee;
import com.blizzard.buy.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    //@RequestBody 把请求的body中的数据，springmvc的的原理封装进去
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        //模拟
        if ("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.myAjaxResult();
        }else{
            return AjaxResult.myAjaxResult().setSuccess(false).setMsg("登录失败");
        }
    }
}
