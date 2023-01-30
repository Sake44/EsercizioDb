package dao;

import java.sql.Connection;
import java.sql.Statement;

import model.computer;

public class computerDAOImpl implements computerDAO {
    private static final String jdbcURL = "jdbc:mysql://127.0.0.1:3306/computers";
    private static final String jdbcUsername = "root";
    private static final String password = "@AtonSQL1234"; 
    private static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    //queries store in var
    private static final String SELECT_PC_BY_BRAND = "SELECT BRAND, SCHERMO, GPU, PREZZO FROM COMPUTER WHERE BRAND=?";
    private static final String SELECT_PC_BY_PRICE = "SELECT BRAND, SCHERMO, GPU, PREZZO FROM COMPUTER WHERE PRICE=?";
    private static final String SELECT_ALL_PCS = "SELECT * FROM COMPUTER";
    private static final String DELETE_PC = "DELETE FROM COMPUTER WHERE ID=?";
    private static final String UPDATE_PC = "UPDATE COMPUTER SET BRAND = ?, RAM = ?, CPU = ?, SCHERMO = ?, GPU = ?, PREZZO = ? WHERE ID = ?";
    private static final String INSERT_PC = "INSERT INTO COMPUTER (BRAND, RAM, CPU, SCHERMO, GPU, PREZZO) VALUES (?,?,?,?,?,?)";

    @Override
    public void inserisciComputer(computer pc) {
        Statement stmt = null;
        Connection conn = null;

        try {
            //registro driver jdbc
            
        }
        
    }

    @Override
    public void cercaPerNome(String brand) {
        
    }

    @Override
    public void cercaPerPrezzo(int prezzo) {
        
    }

    @Override
    public void eliminaComputer(computer pc) {
        
    }

    @Override
    public void modificaComputer(computer pc) {
        
    }
}
