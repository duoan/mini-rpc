package xyz.anduo.rpc.sieve.modules.simple.impl;

import xyz.anduo.rpc.sieve.core.RpcService;
import xyz.anduo.rpc.sieve.modules.simple.HelloService;

// 指定远程接口
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello! " + name;
	}

}
