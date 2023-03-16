package com.crud.DbConection;
//Confesso que nessa conecção eu to perdido
public class ConectioDB {
    String url = "jdbc:mysql://localhost:8080/Nome_banco_de_dados_aqui";
    String user = "usuario";
    String password = "senha";

Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conexao = DriverManager.getConnection(url, user, password);

}
