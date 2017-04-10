package root.dao;

import entity.Entity;
import org.springframework.stereotype.Component;

/**
 * Created by Lee on 2017/4/9 0009.
 */
@Component
public class EntityRepository {

    public Entity findByUsername(String username) {
        Entity entity=new Entity();
        entity.setUsername("lee");
        entity.setPassword("password");
        return entity;
    }
}
