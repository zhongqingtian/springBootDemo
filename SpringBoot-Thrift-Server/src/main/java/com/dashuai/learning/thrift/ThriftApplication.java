package com.dashuai.learning.thrift;

import com.dashuai.learning.thrift.server.RPCThriftServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThriftApplication {

    @Bean(initMethod = "start") // 初始化类RPCThriftServer 调动start()方法
    public RPCThriftServer rpcThriftServer() { //
        return new RPCThriftServer();
    }


    public static void main(String[] args) {
        SpringApplication.run(ThriftApplication.class, args);
    }

}
