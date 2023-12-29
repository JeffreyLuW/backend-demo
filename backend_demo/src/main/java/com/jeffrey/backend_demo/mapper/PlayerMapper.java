package com.jeffrey.backend_demo.mapper;
import com.jeffrey.backend_demo.model.Player;
import org.apache.ibatis.annotations.*;

import java.util.List;

//By defining this interface, you establish a contract that any class implementing the PlayerMapper interface must provide implementations for these methods.
// The actual implementations will vary based on the specific ORM framework(mybatis) or data access technology being used.
@Mapper
public interface PlayerMapper {
    List<Player> findAll();
    Player findById(int id);
    int insert(Player player);
    void update(Player player);
    void delete(int id);
}

