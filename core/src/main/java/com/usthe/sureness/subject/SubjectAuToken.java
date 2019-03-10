package com.usthe.sureness.subject;


/**
 *    AuthenticationToken   AuthorizationToken
 * @author tomsun28
 * @date 21:58 2019-01-22
 */
public interface SubjectAuToken {

    /**
     * description TODO
     *
     * @return java.lang.Object
     */
    Object getPrincipal();

    /**
     * description TODO
     *
     * @return java.lang.Object
     */
    Object getCredentials();

    /**
     * description TODO
     *
     * @return java.lang.Object
     */
    Object getOwnRoles();

    /**
     * description TODO
     *
     * @return java.lang.Object
     */
    Object getTargetResource();

    /**
     * description 获取token 在url-role树中匹配出来的roles
     * 访问 getTargetResource() 所支持的 roles
     *
     * @return java.lang.Object
     */
    Object getSupportRoles();

}