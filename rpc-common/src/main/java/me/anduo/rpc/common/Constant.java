package me.anduo.rpc.common;

/**
 * @author duoan
 */
public interface Constant {
    int ZK_SESSION_TIMEOUT = 5000;
    /**
     * 服务注册ZK根节点
     */
    String ZK_REGISTRY_PATH = "/registry";
    /**
     * 服务数据存储ZK根节点
     */
    String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";
}
