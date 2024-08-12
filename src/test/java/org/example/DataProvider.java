package org.example;

import org.example.model.Player;

import java.util.List;

public class DataProvider {

    public static List<Player> playerListMock(){

        System.out.println("Obteniendo listado player mock");

        return List.of(
                new Player(1L,"Lautaro","Delantero","Boca Juniors"),
                new Player(2L,"Luis","Delantero","River Plate"),
                new Player(3L,"Roberto","Defensor","River Plate"),
                new Player(4L,"Carlos","Arquero","Boca Juniors"),
                new Player(5L,"Sergio","Defensor","Flamenco")
        );
    }

    public static Player playerMock (){
        System.out.println("Soy un mock");
        return  new Player(1L,"Lautaro","Delantero","Boca Juniors");
    }

    public static Player newPlayerMock(){
        return  new Player(6L,"Lionel Messi","Delantero","Barcelona");
    }


}

