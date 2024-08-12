package org.example.repository;

import org.example.model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepositoryImpl implements IPlayerRepository{

    private List<Player> playerDataBase = new ArrayList<>(List.of(
            new Player(1L,"Lautaro","Delantero","Boca Juniors"),
            new Player(1L,"Luis","Delantero","River Plate"),
            new Player(2L,"Roberto","Defensor","River Plate"),
            new Player(3L,"Carlos","Arquero","Boca Juniors"),
            new Player(4L,"Sergio","Defensor","Flamenco")
    ));


    @Override
    public List<Player> findAll() {
        System.out.println("Metodo findAll real <----");
        return this.playerDataBase;
    }

    @Override
    public Player findById(Long id) {
        System.out.println("Metodo findById real <---");
        return this.playerDataBase.stream()
                .filter(player -> player.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public void save(Player player) {
        System.out.println("Metodo save real <---");
        this.playerDataBase.add(player);
    }

    @Override
    public void deleteById(Long id) {
        System.out.println("metodo deleteById real <---");
        this.playerDataBase = this.playerDataBase.stream()
                .filter(player -> player.getId() != id)
                .toList();
    }
}
