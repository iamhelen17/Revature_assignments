package com.app.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.dateutil.DateConverter;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select name, age, gender, teamname, contact, dob from roc_revature.player where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				player = new Player();
				player.setId(id);  //local
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
			} else {
				throw new BusinessException("No Player found with Id " +id);
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player where contact = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setLong(1, contact);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setTeamname(resultSet.getString("teamname"));
				player.setDob(resultSet.getDate("dob"));
			} else {
				throw new BusinessException("No Player found with Contact " +contact);
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
		
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {                       //while loop since there are multiple players
				Player player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playersList.add(player);
			} 
			if (playersList.size() == 0) {
				throw new BusinessException("No Players in the DB so far");
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player where age = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
		
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {                       //while loop since there are multiple players
				Player player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playersList.add(player);
			} 
			if (playersList.size() == 0) {
				throw new BusinessException("No Players found with age " +age);
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player where gender = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
		
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {                       //while loop since there are multiple players
				Player player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playersList.add(player);
			} 
			if (playersList.size() == 0) {
				throw new BusinessException("No Players found with gender " +gender);
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player where teamname = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, teamname);
		
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {                       //while loop since there are multiple players
				Player player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playersList.add(player);
			} 
			if (playersList.size() == 0) {
				throw new BusinessException("No Players found with teamname " +teamname);
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		try (Connection connection = PostgresqlConnection.getConnection()) {
			
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player where name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
		
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {                       //while loop since there are multiple players
				Player player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playersList.add(player);
			} 
			if (playersList.size() == 0) {
				throw new BusinessException("No Players found with name " +name);
			}
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		
		return playersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player> playersList = new ArrayList<>();
		
		
		try (Connection connection = PostgresqlConnection.getConnection()) {
			String sql = "select id, name, age, gender, teamname, contact, dob from roc_revature.player where dob = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);		
			
			// Convert String dob to a Date object.
			Date date = DateConverter.makeDate(dob);
			preparedStatement.setDate(1, new java.sql.Date(date.getTime()));
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {                       //while loop since there are multiple players
				Player player = new Player();
				player.setId(resultSet.getInt("id"));  
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setContact(resultSet.getLong("contact"));
				player.setDob(resultSet.getDate("dob"));
				player.setTeamname(resultSet.getString("teamname"));
				playersList.add(player);
			} 
			if (playersList.size() == 0) {
				throw new BusinessException("No Players found with dob " +dob);
			}
			
			
		}  catch (ClassNotFoundException | SQLException e) {
			System.out.println("I am here! " + e); //Take off this line when app is live
			throw new BusinessException("Internal error occurred. Contact SYSADMIN");
		}
		
		
		return playersList;
	}

}
