package org.example.service;

import org.example.DataProvider;
import org.example.model.Player;
import org.example.repository.PlayerRepositoryImpl;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceImplTest {

    @Mock
    private PlayerRepositoryImpl playerRepository;
    @InjectMocks
    private PlayerServiceImpl playerService;

    @Test
    public void testFindAll(){
        //Given
        /* No se suele usar de esta manera los mocks
            PlayerRepositoryImpl playerRepository = mock(PlayerRepositoryImpl.class); // Simulacion
            PlayerServiceImpl playerService =  new PlayerServiceImpl(playerRepository);
        */
        //When
        when(playerRepository.findAll()).thenReturn(DataProvider.playerListMock());
        List<Player> playerList = playerService.findAll();

        //Then
        assertNotNull(playerList);
        assertFalse(playerList.isEmpty());
        assertEquals("Luis",playerList.get(1).getName());

    }

    @Test
    public void testFindById(){
        Long id = 2L;
        when(playerRepository.findById(id)).thenReturn(DataProvider.playerMock());
        Player playerResult = playerService.findById(id);

        assertNotNull(playerResult);
        assertEquals("Lautaro",playerResult.getName());
        verify(this.playerRepository).findById(anyLong());
    }

    @Test
    public void testSave(){
        Player player = DataProvider.newPlayerMock();

        playerService.save(player);

        ArgumentCaptor<Player> playerCaptor = ArgumentCaptor.forClass(Player.class);
        verify(this.playerRepository).save(any(Player.class));
        verify(this.playerRepository).save(playerCaptor.capture());
        assertEquals("Lionel Messi",playerCaptor.getValue().getName());

    }

    @Test
    public void testDeleteById(){
        Long id = 1L;

        playerService.deleteById(id);

        ArgumentCaptor<Long> longArgumentCaptor = ArgumentCaptor.forClass(Long.class);
        verify(this.playerRepository).deleteById(anyLong());
        verify(this.playerRepository).deleteById(longArgumentCaptor.capture());
        assertEquals(1L,longArgumentCaptor.getValue());
    }
}
