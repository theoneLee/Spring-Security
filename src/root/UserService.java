package root;

import entity.Entity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import root.dao.EntityRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lee on 2017/4/9 0009.
 */
public class UserService implements UserDetailsService {
    private final EntityRepository entityRepository;

    public UserService(EntityRepository entityRepository) {//注入数据源
        this.entityRepository = entityRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Entity entity=entityRepository.findByUsername(username);//在数据源查找相应entity
        if (entity!=null){
            List<GrantedAuthority> authorityList=new ArrayList<GrantedAuthority>();
            authorityList.add(new SimpleGrantedAuthority("ROLE_ENTITY"));//创建权限为“ROLE_ENTITY”的列表（可以自定义权限名字）
            return new User(entity.getUsername(),entity.getPassword(),authorityList);
        }
        throw new UsernameNotFoundException("User '"+"' not found.");
    }


}
