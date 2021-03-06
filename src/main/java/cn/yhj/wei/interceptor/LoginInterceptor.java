package cn.yhj.wei.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @package: com.yhj.boot.first.interceptor
 * @ClassName: LoginInterceptor
 * @author: yhj.
 * @date : 2022-01-07 13:56
 **/

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
 /*   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI =request.getRequestURI();
        log.info("preHandle拦截器的请求路径是{}",requestURI);
        HttpSession session =request.getSession();
        Object loginUser =session.getAttribute("loginUser");
        if (loginUser!=null){
            return  true;
        }
        request.setAttribute("msg","请先登入");
        request.getRequestDispatcher("/login").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle执行"+modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion执行异常"+ex);
    }*/
}
