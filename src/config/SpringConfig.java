package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaohao
 * @create 2021-05-07 23:36
 */
@Configuration//加这个注解使这个类作为配置类代替配置文件
@ComponentScan(basePackages = {"com.hyh"})//大括号数组里面写需要扫描的包类
public class SpringConfig {
}
