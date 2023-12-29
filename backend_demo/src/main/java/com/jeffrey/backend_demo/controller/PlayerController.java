package com.jeffrey.backend_demo.controller;

import com.jeffrey.backend_demo.model.Player;
import com.jeffrey.backend_demo.service.PlayerService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    private PlayerService playerService;
    void PlayerService(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

    @GetMapping
    public Player findById(int id){
        return playerService.findById(id);
    }

    @PostMapping
    public int insert(Player player){
        return playerService.insert(player);
    }

    @PutMapping
    public void update(Player player){
        playerService.update(player);
    }


    @DeleteMapping
    public void delete(int id){
        playerService.delete(id);
    }
}
