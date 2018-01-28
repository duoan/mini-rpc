//package me.anduo.rpc.example;
//
//
//import me.anduo.rpc.client.RpcProxy;
//import me.anduo.rpc.server.core.RpcBootstrap;
//import me.anduo.rpc.server.modules.simple.HelloService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.concurrent.TimeUnit;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring-client.xml")
//public class HelloServiceTest {
//
//    @Autowired
//    private RpcProxy rpcProxy;
//
//    @Test
//    public void helloTest() {
//        try {
//            new Thread(() -> RpcBootstrap.main(null));
//            TimeUnit.SECONDS.sleep(10);
//
//            System.out.println("123");
//            HelloService helloService = rpcProxy.create(HelloService.class);
//            String result = helloService.hello("World");
//            Assert.assertEquals("Hello! World", result);
//
//            RpcBootstrap
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
