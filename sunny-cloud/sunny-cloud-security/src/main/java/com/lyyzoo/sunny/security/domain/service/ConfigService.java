package com.lyyzoo.sunny.security.domain.service;

import com.lyyzoo.sunny.core.base.Service;
import com.lyyzoo.sunny.security.domain.entity.Config;

/**
 * ConfigService
 *
 * @author bojiangzhou 2018/09/17
 */
public interface ConfigService extends Service<Config> {

    /**
     * @param passwordErrorTime 密码错误次数
     * @return 是否启用验证码
     */
    boolean isEnableCaptcha(Integer passwordErrorTime);
}
