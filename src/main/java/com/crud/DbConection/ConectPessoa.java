package com.crud.DbConection;

import com.crud.Model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConectPessoa {
        private ConectionDB conexao;

        public void salvar(Pessoa pessoa) throws SQLException {
            String sql = "INSERT INTO pessoa (nome, sobrenome,cpf,email,endereço,nacionalidade) VALUES (?, ? , ? , ? , ? , ?)";
            Connection connection = conexao.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2,pessoa.getSobrenome());
            stmt.setString(3,pessoa.getCpf());
            stmt.setString(4,pessoa.getEmail());
            stmt.setString(5,pessoa.getEndereco());
            stmt.setString(6,pessoa.getNacionalidade());

            stmt.executeUpdate();
            stmt.close();
        }

}
