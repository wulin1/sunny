package com.lyyzoo.sunny.security.domain.service;

import com.lyyzoo.sunny.core.base.Service;
import com.lyyzoo.sunny.security.domain.entity.Client;

/**
 * ClientService
 *
 * @author bojiangzhou 2018/11/03
 */
public interface ClientService extends Service<Client> {

    /**
     * 通过 clientId 查询客户端
     * 
     * @param clientId clientId
     * @return Client
     */
    Client selectByClientId(String clientId);

}
