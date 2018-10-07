package com.stone.demo.web.webfilter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author shiqing
 * @data 18/7/17
 */
@Configuration
public class WebConfiguration {

  @Bean
  public RemoteIpFilter remoteIpFilter() {
    return new RemoteIpFilter();
  }

  @Bean
  public FilterRegistrationBean testFilterRegistration() {
    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
    registrationBean.setFilter(new MyFilter());
    registrationBean.addUrlPatterns("/*");
    registrationBean.addInitParameter("paramName", "paramValue");
    registrationBean.setName("MyFilter");
    registrationBean.setOrder(1);
    return registrationBean;
  }

  public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

      HttpServletRequest httpServletRequest = (HttpServletRequest) request;
      System.out.println("MyFilter, url : "+ httpServletRequest.getRequestURI());
      chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
  }
}
