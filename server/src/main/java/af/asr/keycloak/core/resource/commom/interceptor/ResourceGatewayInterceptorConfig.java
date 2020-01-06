package af.asr.keycloak.core.resource.commom.interceptor;

import af.asr.identity.infrastructure.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class ResourceGatewayInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    ResourceGatewayInterceptor resourceGatewayInterceptor;

    public ResourceGatewayInterceptorConfig(){ }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(resourceGatewayInterceptor).addPathPatterns(Constants.INTERCEPTOR_PATTERNS.split(","));
    }

}
