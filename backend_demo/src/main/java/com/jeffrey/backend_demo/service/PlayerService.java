package com.jeffrey.backend_demo.service;
import com.jeffrey.backend_demo.mapper.PlayerMapper;
import com.jeffrey.backend_demo.model.Player;
import java.util.List;
public class PlayerService {
    private PlayerMapper playerMapper;

    public PlayerService(PlayerMapper playerMapper){
        this.playerMapper = playerMapper;
    }

    public List<Player> findAll(){
        return playerMapper.findAll();
    }

    public Player findById(int id){
        return playerMapper.findById(id);
    }

    public int insert(Player player){
        return playerMapper.insert(player);
    }

    public void update(Player player){
        playerMapper.update(player);
    }

    public void delete(int id){
        playerMapper.delete(id);
    }

}
