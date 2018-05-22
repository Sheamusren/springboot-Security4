package com.jiakong.framework.springbootsecurity;

import com.jiakong.framework.springbootsecurity.config.Appctx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 安全系统启动类
 *
 * @author admin
 */
@SpringBootApplication
public class SpringbootSecurityApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringbootSecurityApplication.class);

    /**
     * 将密码加密 可以先设置初始密码：000000
     * //然后使用密码为key值进行加密，运行主类后，会自动加密密码，可连接数据库查看。
     * su.setPassword(bc.encode(su.getPassword()));
     *
     * @param args
     */
    public static void main(String[] args) {
        logger.info("安全框架启动");
        SpringApplication application = new SpringApplication(SpringbootSecurityApplication.class);
        Appctx.ctx = application.run(args);

//        UserService suserService = (UserService) Appctx.ctx.getBean("suserService");
//        SysUser su= suserService.findByName("TEST");
//        BCryptPasswordEncoder bc=new BCryptPasswordEncoder(4);
//        su.setPassword(bc.encode(su.getPassword()));
//        System.out.println("密码"+su.getPassword());
//        /**
//         * 运行一次后记得注释这段重复加密会无法匹配
//         */
//        suserService.update(su);
    }
}
