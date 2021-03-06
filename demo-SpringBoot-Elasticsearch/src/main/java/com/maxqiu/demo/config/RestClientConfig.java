package com.maxqiu.demo.config;

import java.time.Duration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

/**
 * Java高级别REST客户端是Elasticsearch的默认客户端
 *
 * Bean方式配置
 *
 * @author Max_Qiu
 */
@Configuration
public class RestClientConfig extends AbstractElasticsearchConfiguration {
    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {

        // 使用构建器来提供集群地址，设置默认值HttpHeaders或启用SSL。
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
            // 设置连接地址
            .connectedTo("127.0.0.1:9200")
            // 可以设置多个地址
            // .connectedTo("127.0.0.1:9200", "127.0.0.1:9201")
            // 是否启用ssl
            // .usingSsl()
            // 设置连接超时时间
            .withConnectTimeout(Duration.ofSeconds(10))
            // 设置
            .withSocketTimeout(Duration.ofSeconds(30))
            // 设置用户名密码
            // .withBasicAuth("elastic", "123456")
            // 创建连接信息
            .build();

        // 创建RestHighLevelClient。
        return RestClients.create(clientConfiguration).rest();
    }
}
