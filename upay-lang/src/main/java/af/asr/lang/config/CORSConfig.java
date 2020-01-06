package af.asr.lang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration
public class CORSConfig{


    public static final List<String> allowedMethods = new ArrayList<>(Collections.singletonList("POST"));
    public static final List<String> allowedHeaders = new ArrayList<>(Collections.singletonList("*"));

    public static final String ALLOWED_PATH = "/api/test/**";
    /**
     *
     * Cross Origin Request Allow
     */
    @Bean
    public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.setAllowedOrigins(Collections.singletonList("*"));
        config.setAllowedMethods(Collections.singletonList("*"));
        config.setAllowedHeaders(Collections.singletonList("*"));

//        config.setAllowCredentials(true);
//        config.setAllowedOrigins(ips);
//        config.setAllowedMethods(allowedMethods);
//        config.setAllowedHeaders(allowedHeaders);

        source.registerCorsConfiguration(ALLOWED_PATH, config);
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }

}
