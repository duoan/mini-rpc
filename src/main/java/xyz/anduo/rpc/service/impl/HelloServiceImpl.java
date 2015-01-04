package xyz.anduo.rpc.service.impl;

import xyz.anduo.rpc.server.RpcService;
import xyz.anduo.rpc.service.HelloService;

// 指定远程接口
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello! " + name;
	}

}
