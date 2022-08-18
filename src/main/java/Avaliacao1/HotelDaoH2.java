package Avaliacao1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class HotelDaoH2 implements  IDao<Hotel>{
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(HotelDaoH2.class.getName());
    public HotelDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Hotel salvar(Hotel hotel) {
        log.info("registrando um novo hotel: " + hotel.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO hotel(nomeFilial, rua, numero, cidade, estado, eh5Estrelas) VALUES('%s','%s','%s','%s','%s','%s')",
                hotel.getNomeFilial(), hotel.getRua(), hotel.getNumero(), hotel.getCidade(), hotel.getEstado(), hotel.getEh5Estrelas()
        );

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();

            if (keys.next()){
                hotel.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return hotel;
    }
}
