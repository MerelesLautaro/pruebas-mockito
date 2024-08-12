package org.example.repository;

import org.example.model.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> findAll();
    Player findById(Long id);
    void save(Player player);
    void deleteById(Long id);
}
