/*package br.com.sw2you.realmeet.unit;

import br.com.sw2you.realmeet.core.BaseUnitTest;
import br.com.sw2you.realmeet.domain.repository.RoomRepository;
import br.com.sw2you.realmeet.mapper.RoomMapper;
import br.com.sw2you.realmeet.service.RoomService;
import br.com.sw2you.realmeet.utils.MapperUtils;
import br.com.sw2you.realmeet.utils.TestDataCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static br.com.sw2you.realmeet.utils.TestConstants.DEFAULT_ROOM_ID;


class RoomServiceUnitTest extends BaseUnitTest {

    private RoomService victim;

    @Mock
    private RoomRepository roomRepository;

    @BeforeEach
    void setupEach(){
        victim = new RoomService(roomRepository, MapperUtils.roomMapper());
    }

    @Test
    void testGetRoomSuccess(){
        //var room = TestDataCreator.roomBuild().id(DEFAULT_ROOM_ID).build();
        //Mockito.when(roomRepository.findById(DEFAULT_ROOM_ID)).thenReturn(Optional.of(room));

        var room = newRoomBuilder().id(DEFAULT_ROOM_ID).build();
        Mockito.when(roomRepository.findByIdAndActive(DEFAULT_ROOM_ID, true)).thenReturn(Optional.of(room));

        var dto = victim.getRoom(DEFAULT_ROOM_ID);

        Assertions.assertEquals(room.getId(), dto.getId());
        Assertions.assertEquals(room.getName(), dto.getName());
        Assertions.assertEquals(room.getSeats(), dto.getSeats());
    }

}
*/