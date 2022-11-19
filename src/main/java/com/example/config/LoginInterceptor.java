package com.example.config;

import com.example.model.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 登录拦截器
 *
 * @Name LoginInterceptor
 * @Author 舟鸿
 * @Date 2022-11-17 10:02
 */
//
//@Slf4j
//@Component
//public class LoginInterceptor implements HandlerInterceptor {
//
//    /***
//     * 在请求处理之前进行调用(Controller方法调用之前)
//     */
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("执行了拦截器的preHandle方法");
//        System.out.println("执行了拦截器的preHandle方法");
//        try {
//            HttpSession session = request.getSession();
//            //统一拦截（查询当前session是否存在id）(这里user会在每次登录成功后，写入session)
//            Long id = (Long) session.getAttribute("employee");
//            log.info("" + id);
//            System.out.println(id);
//            if (id == null) {
//                request.getRequestDispatcher("/static/backend/page/login/login.html").forward(request, response);
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return true;
////        return false;
//        //如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
//        //如果设置为true时，请求将会继续执行后面的操作
//
//    }
//
//    /***
//     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
//     */
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        System.out.println("执行了拦截器的postHandle方法");
//    }
//
//    /***
//     * 整个请求结束之后被调用，也就是在DispatchServlet渲染了对应的视图之后执行（主要用于进行资源清理工作）
//     */
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("执行了拦截器的afterCompletion方法");
//    }
//}
