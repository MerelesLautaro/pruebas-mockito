package org.example;

import org.example.repository.PlayerRepositoryImpl;
import org.example.service.PlayerServiceImpl;

public class Main {
    public static void main(String[] args) {
        PlayerRepositoryImpl playerRepository = new PlayerRepositoryImpl();
        PlayerServiceImpl playerService = new PlayerServiceImpl(playerRepository);

        //System.out.println(playerService.findAll());
        //System.out.println(playerService.findById(2L));

    }
}