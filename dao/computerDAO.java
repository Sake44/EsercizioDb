package dao;

import model.computer;

public interface computerDAO {
    /* private String jdbcURL = "jdbc:mysql://127.0.0.1:3306/catalogo";
    private String jdbcUsername = "root";
    private String password = "Rizlaplus13!"; */


    /* 
     * definisco delle stringhe statiche dove storare le queries richieste
     * 
     */
  /*   private static final String SELECT_PC_BY_BRAND = "SELECT BRAND, SCHERMO, GPU, PREZZO FROM COMPUTER WHERE BRAND=?";
    private static final String SELECT_PC_BY_PRICE = "SELECT BRAND, SCHERMO, GPU, PREZZO FROM COMPUTER WHERE PRICE=?";
    private static final String SELECT_ALL_PCS = "SELECT * FROM COMPUTER";
    private static final String DELETE_PC = "DELETE FROM COMPUTER WHERE ID=?";
    private static final String UPDATE_PC = "UPDATE COMPUTER SET BRAND = ?, RAM = ?, CPU = ?, SCHERMO = ?, GPU = ?, PREZZO = ? WHERE ID = ?"; */

    public void inserisciComputer(computer pc);
    public void cercaPerNome(String brand);
    public void cercaPerPrezzo(int prezzo);
    public void eliminaComputer(computer pc);
    public void modificaComputer(computer pc);

}