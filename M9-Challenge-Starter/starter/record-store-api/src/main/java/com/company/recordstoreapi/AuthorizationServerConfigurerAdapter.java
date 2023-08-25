package com.company.recordstoreapi;

public abstract class AuthorizationServerConfigurerAdapter {
    public abstract void configure(ClientDetailsServiceConfigurer clients) throws Exception;

    public abstract void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception;
}
