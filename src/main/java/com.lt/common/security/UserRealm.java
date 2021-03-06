package com.lt.common.security;

import com.lt.entity.User;
import com.lt.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import test.InvocationHandlerAndProxy.jdkimpl.People;

import javax.annotation.Resource;

public class UserRealm extends AuthorizingRealm {

    @Resource(name = "UserService")
    private UserService userService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //查询用户信息
        User user=new User();
        user=userService.findUserByName(token.getUsername());
        //User user=new User("1","zhangsan","123","男");
        //账号不存在
        if (user == null) {
            throw new UnknownAccountException("账号或密码不正确");
        }

        //账号锁定
       /* if (user.getState().equals("1")) {
            throw new LockedAccountException("账号已被冻结,请联系管理员");
        }*/
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        return info;
    }
}
