package dao;

import model.Computer;

public class ComputerDAOImpl implements ComputerDAO {
    private static String jdbcURL = "jdbc:mysql://127.0.0.1:3306/computers";
    private static String jdbcUsername = "root";
    private static String password = "@AtonSQL1234"; 


    @Override
    public void inserisciComputer(Computer pc) {
        
    }

    @Override
    public void cercaPerNome(String brand) {
        
    }

    @Override
    public void cercaPerPrezzo(int prezzo) {
        
    }

    @Override
    public void eliminaComputer(Computer pc) {
        
    }

    @Override
    public void modificaComputer(Computer pc) {
        
    }
}
