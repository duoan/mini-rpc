package me.anduo.rpc.example;


import me.anduo.rpc.client.RpcProxy;
import me.anduo.rpc.server.modules.sample.HelloService;
import org.junit.Assert;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {

    private RpcProxy rpcProxy;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-client.xml");
        HelloServiceTest test = new HelloServiceTest();
        test.rpcProxy = ctx.getBean(RpcProxy.class);
        test.helloTest();
    }

    private void helloTest() {
        try {
            HelloService helloService = rpcProxy.create(HelloService.class);
            String result = helloService.hello("World");
            Assert.assertEquals("Hello! World", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
