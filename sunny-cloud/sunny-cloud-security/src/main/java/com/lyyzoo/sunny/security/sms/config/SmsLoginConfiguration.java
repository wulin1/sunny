package com.lyyzoo.sunny.security.sms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.lyyzoo.sunny.captcha.CaptchaMessageHelper;
import com.lyyzoo.sunny.security.core.CustomUserDetailsService;
import com.lyyzoo.sunny.security.sms.SmsAuthenticationDetailsSource;
import com.lyyzoo.sunny.security.sms.SmsAuthenticationFailureHandler;
import com.lyyzoo.sunny.security.sms.SmsAuthenticationProvider;
import org.springframework.context.annotation.Configuration;

/**
 * 短信登录配置
 *
 * @author bojiangzhou 2018/10/28
 */
@Configuration
public class SmsLoginConfiguration {

    @Autowired
    private CustomUserDetailsService userDetailsService;
    @Autowired
    private CaptchaMessageHelper captchaMessageHelper;

    @Bean
    public SmsAuthenticationFailureHandler smsAuthenticationFailureHandler() {
        return new SmsAuthenticationFailureHandler();
    }

    @Bean
    public SmsAuthenticationDetailsSource smsAuthenticationDetailsSource() {
        return new SmsAuthenticationDetailsSource();
    }

    @Bean
    public SmsAuthenticationProvider smsAuthenticationProvider() {
        return new SmsAuthenticationProvider(userDetailsService, captchaMessageHelper);
    }

}
