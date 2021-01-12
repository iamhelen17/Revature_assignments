package com.app.main;

import java.util.Date;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.impl.PlayerCrudDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerCrudDAO dao = new PlayerCrudDAOImpl();
		
		/*Player p = new Player(8, "Justin", 18, "M", "6549870987", new Date(), 400);
		
		try {
			if (dao.createPlayer(p) != 0) {  //if the creation is successful it will return 1, if creation is not successful return 0
				System.out.println("Player created successfully");
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			dao.deletePlayer(8);
			System.out.println("Player deleted successfully");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());;
		}*/
			
	
		
		
		
		try {
			if (dao.updatePlayerContact(3, "8764539087") != 0) {
					System.out.println("Player updated successfully");
				}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		} 
		
		/*try {
			Player player = dao.getPlayerById(3);
			if (player != null) {
				System.out.println("Details of player with Player_id " +player.getPlayer_id());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());;
		}*/
		
		try {
			List<Player> playersList = dao.getAllPlayers();
			if (playersList != null && playersList.size() != 0) {
				System.out.println("\n\nFound " +playersList.size() +" no. of players in DB... Printing them all");
				for (Player p : playersList) {
					System.out.println(p);
				}
			}
			
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}

}

/* 1)Try running the same app and get an idea of what is going on and where
 * 2)Look into the recording and parallelly try to recreate the whole app by yourself from scratch
 * 3)Complete update and delete operations and complete PlayerSearchDAOImpl
 */
