package cn.cby.aigou.web.controller;

import cn.cby.aigou.domain.User;
import cn.cby.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public AjaxResult get(){
        return new AjaxResult();
    }
}
