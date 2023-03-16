package com.crud.DbConection;

import com.crud.Model.Pessoa;

import java.sql.SQLException;

public class ConectPessoa {
        private Connection conexao;

        public ConectPessoa(Connection conexao) {
            this.conexao = conexao;
        }
        //função para salvar os dados no banco de dados
        public void salvar(Pessoa pessoa) throws SQLException {
            String sql = "INSERT INTO pessoa (nome, sobrenome,cpf,email,endereço,nacionalidade) VALUES (?, ? , ? , ? , ? , ?)";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(pessoa.getnome());
            stmt.setString(pessoa.getsobrenome());
            stmt.setString(pessoa.getcpf());
            stmt.setString(pessoa.getemail());
            stmt.setString(pessoa.getendereco());
            stmt.setString(Pessoa.getnaconalidade());

            stmt.executeUpdate();
            stmt.close();
        }

}
