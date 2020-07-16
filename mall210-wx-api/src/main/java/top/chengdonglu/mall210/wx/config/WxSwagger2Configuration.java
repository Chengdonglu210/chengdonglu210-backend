package top.chengdonglu.mall210.wx.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger在线文档配置<br>
 * 项目启动后可通过地址：http://host:ip/swagger-ui.html 查看在线文档
 */

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class WxSwagger2Configuration {
    @Bean
    public Docket wxDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("wx")
                .apiInfo(wxApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.chengdonglu.mall210.wx.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo wxApiInfo() {
        return new ApiInfoBuilder()
                .title("mall210-wx API")
                .description("mall210wxAPI")
                .termsOfServiceUrl("https://github.com/Chengdonglu210/chengdonglu210-backend")
                .version("1.0")
                .build();
    }
}
