package com.pikachu.common.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huang_kangjie
 * @create 2018-06-12 17:33
 **/
public class HttpParamUtils {

     /**
      * 获取get请求中的所有参数
      * @param request
      * @return
      */
     public static Map<String, String> getParamsByGet(HttpServletRequest request){
          Map<String, String> map = new HashMap<>();
          Enumeration<String> params = request.getParameterNames();
          while (params.hasMoreElements()) {
               String param = params.nextElement();
               map.put(param, request.getParameter(param));
          }
          return map;
     }

}
