package Avaliacao1;

import Avaliacao1.ConfiguracaoJDBC;
import Avaliacao1.Hotel;
import Avaliacao1.HotelDaoH2;
import Avaliacao1.HotelService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HotelServiceTest {
    HotelService hotelService;
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(HotelDaoH2.class.getName());

    @BeforeEach
    void doBefore(){
        hotelService = new HotelService(new HotelDaoH2(new ConfiguracaoJDBC()));

    }

    @Test
    public void  salvarHotel(){
        Hotel hotelFourSeasonsSP = new Hotel("Four Seasons Sao Paulo","Avenida Paulista",1000,"Sao Paulo", "Sao Paulo", true);
        hotelService.salvar(hotelFourSeasonsSP);
        assertTrue(hotelFourSeasonsSP.getId()!=null);

        Hotel hotelFourSeasonsRJ = new Hotel("Four Seasons Rio de Janeiro","Avenida Atlantica",1000,"Rio de Janeiro", "Rio de Janeiro", true);
        hotelService.salvar(hotelFourSeasonsRJ);
        assertTrue(hotelFourSeasonsRJ.getId()!=null);

        Hotel hotelFourSeasonsNYC = new Hotel("Four Seasons NYC","4th Avenue",1000,"New Yory", "New York", true);
        hotelService.salvar(hotelFourSeasonsNYC);
        assertTrue(hotelFourSeasonsNYC.getId()!=null);

        Hotel hotelFourSeasonsPARIS = new Hotel("Four Seasons Paris","Champs Elysees",1000,"Paris", "Paris", true);
        hotelService.salvar(hotelFourSeasonsPARIS);
        assertTrue(hotelFourSeasonsPARIS.getId()!=null);

        Hotel hotelFourSeasonsTOKYO = new Hotel("Four Seasons Tokyo","xpto",1000,"Tokyo", "Tokyo", true);
        hotelService.salvar(hotelFourSeasonsTOKYO);
        assertTrue(hotelFourSeasonsTOKYO.getId()!=null);














    }
}
