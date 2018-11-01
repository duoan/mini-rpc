package me.anduo.rpc.server.modules.sample.impl;

import me.anduo.rpc.server.core.RpcService;
import me.anduo.rpc.server.modules.sample.HelloService;

// 指定远程接口
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello! " + name;
	}

}
