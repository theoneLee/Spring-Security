package conf.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 * Created by Lee on 2017/4/5 0005.
 */
@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().loginPage("/login")//在不调用loginPage()时会自动提供一个默认登录页，但是要自定义登录页就要用这个方法并且写一个Controller来映射对应的loginPage()内写的url
                .and()
                .rememberMe()
                .and()
                .logout().logoutSuccessUrl("/").invalidateHttpSession(true)//会拦截/logout的请求并且认为发出退出操作，当然想更改退出的路径名可以用logoutUrl()实现
                .and()
                .authorizeRequests()//在这之后可以配置那些路径需要拦截
                .antMatchers("/home").authenticated()
                .anyRequest().permitAll()
                ;

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("USER","ADMIN");
    }
}
