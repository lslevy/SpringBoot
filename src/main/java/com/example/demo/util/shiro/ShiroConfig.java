package com.example.demo.util.shiro;


import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


@Configuration
public class ShiroConfig {

    /**
     * 配置Shiro的Web过滤器，拦截浏览器请求并交给SecurityManager处理
     * @return
     */

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();


        //安全管理器
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);


        /**
         *添加Shiro的内置过滤器
         *
         * anon:无需认证（登录）即可访问
         * authc:必须认证才可以访问
         * user:如果使用rememberMe的功能可以直接访问
         * perms:资源授权
         * role：角色授权
         *
         *
         */
        Map<String,String> filterMap = new LinkedHashMap<String,String>();


        filterMap.put("/add","authc");
        filterMap.put("/update","authc");

        //修改成功登录的界面
        shiroFilterFactoryBean.setLoginUrl("/login");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        return shiroFilterFactoryBean;
    }


    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("getRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    @Bean(name = "getRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

}
