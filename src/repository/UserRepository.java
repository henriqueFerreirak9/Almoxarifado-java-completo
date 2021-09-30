package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import busines.User;

public class UserRepository implements IUserRepository {

	@Override
	public void inserir(User user) {

		// TODO Auto-generated method stub
		String nome = user.getName();
		String password = user.getPassword();

		String sql = "insert into user (nome, password) values"+"('"+ nome + "','" + password +"')";


		try {
			Connection con = Connect.createConnection();
			String status = Connect.connectionStatus();
			PreparedStatement preparedStatement = Connect.prepareSql(con, sql);
			// Abaixo est� a forma 2 de passar os par�metros.


			preparedStatement.execute();
			JOptionPane.showMessageDialog(null, "Usuario salvo com sucesso!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}





	
	


