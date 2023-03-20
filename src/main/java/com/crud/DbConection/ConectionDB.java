package com.crud.DbConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Confesso que nessa conecção eu to perdido
public class ConectionDB {
    String url = "jdbc:mysql://localhost:8080/Nome_banco_de_dados_aqui";
    String user = "usuario";
    String password = "senha";


    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        }catch(SQLException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
        return null;
    }


}
