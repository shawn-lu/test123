package com.module.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class FrontPageTestController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
       ModelAndView mv = new ModelAndView();
       String viewName = req.getParameter("view");
       mv.setViewName(viewName);
       return mv;
    }
}