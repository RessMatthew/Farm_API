//package com.yami.shop.admin.controller;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @Description
// * @Date 2022/7/4 21:04
// * @Author RessMatthew
// * @Version 1.0
// **/
//
//@WebFilter(filterName = "CorsFilter")
//@CrossOrigin
//public class CORSFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
//        HttpServletResponse response = (HttpServletResponse) res;
//        //使用xhrFields后Access-Control-Allow-Origin
////        response.setHeader("Access-Control-Allow-Origin","http://localhost:9528");
//        //使用xhrFields前的Access-Controller-Allow-Orgin
//        response.setHeader("Access-Controller-Allow-Orgin","*");
//        response.setHeader("Access-Control-Allow-Credentials","true");
//        response.setHeader("Access-Control-Allow-Methods","POST,GET,PATCH,DELETE,PUT");
//        response.setHeader("Access-Control-Max-Age","3600");
//        response.setHeader("Access-Control-Allow-Headers","Origin,X-Requested-With,Content-Type,Accept");
//        chain.doFilter(req,res);
//    }
//}
