package me.anduo.rpc.client;

import net.sf.cglib.proxy.Proxy;

import java.util.UUID;

/**
 * @author duoan
 */
public class RpcProxy {
    private String serverAddress;
    private ServiceDiscovery serviceDiscovery;

    public RpcProxy(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public RpcProxy(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }

    @SuppressWarnings("unchecked")
    public <T> T create(Class<?> interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[]{interfaceClass},
                (proxy, method, args) -> {
                    // 创建并初始化 RPC 请求
                    RpcRequest request = new RpcRequest();
                    request.setRequestId(UUID.randomUUID().toString());
                    request.setClassName(method.getDeclaringClass().getName());
                    request.setMethodName(method.getName());
                    request.setParameterTypes(method.getParameterTypes());
                    request.setParameters(args);

                    if (serviceDiscovery != null) {
                        // 发现服务
                        serverAddress = serviceDiscovery.discover();
                    }
                    String[] array = serverAddress.split(":");
                    String host = array[0];
                    int port = Integer.parseInt(array[1]);

                    // 初始化 RPC 客户端
                    RpcClient client = new RpcClient(host, port);
                    // 通过 RPC客户端发送RPC请求并获取RPC响应
                    RpcResponse response = client.send(request);
                    if (response.isError()) {
                        throw response.getError();
                    } else {
                        return response.getResult();
                    }
                });
    }
}
