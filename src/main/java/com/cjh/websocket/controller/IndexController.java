package com.cjh.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hut1210 2019.4.11
 */
@Controller
public class IndexController {

    @RequestMapping(value = "toIndex")
    public ModelAndView toIndex(){
        return new ModelAndView("index");
    }

    @RequestMapping(value = "test")
    public void test(HttpServletRequest request, HttpServletResponse response){

        System.out.println("kkk.....");
        try {
            response.getWriter().print("ok...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
