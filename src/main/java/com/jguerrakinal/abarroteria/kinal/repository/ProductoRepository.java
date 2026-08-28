/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.jguerrakinal.abarroteria.kinal.repository;

import javafx.collections.ObservableList;
import main.java.com.jguerrakinal.abarroteria.kinal.config.DataBaseConnection;
import main.java.com.jguerrakinal.abarroteria.kinal.model.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
/**
 *
 * @author informatica
 */
public class ProductoRepository {
    
    public ObservableList<Producto> findAll(){
        String sql = "select * from productos";
        ObservableList<Producto> lista = FXCollections.observableArrayList();
        try(PreparedStatement pstm = DataBaseConnection.getDataBaseConnection().prepareStatement(sql)) {
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                lista.add(new Producto(
                    rs.getString("id_producto"),
                    rs.getString("nombre_producto"),
                    rs.getInt("stock"),
                    rs.getDouble("precio")
                ));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
