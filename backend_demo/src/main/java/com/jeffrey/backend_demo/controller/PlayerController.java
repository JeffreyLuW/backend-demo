package com.jeffrey.backend_demo.controller;

import com.jeffrey.backend_demo.model.Player;
import com.jeffrey.backend_demo.service.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
    private PlayerService playerService;

    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> findAll(){
        return playerService.findAll();
    }

    @GetMapping("/{id}")
    public Player findById(@PathVariable  int id){
        return playerService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public int insert(@RequestBody Player player){
        return playerService.insert(player);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Player player,@PathVariable int id){
        player.setId(id);
        playerService.update(player);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        playerService.delete(id);
    }
}
