package com.app.service.impl;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.List;
import java.util.Locale;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.dateutil.DateValidator;

public class PlayerSearchServiceImpl implements PlayerSearchService {

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if (id > 99 && id < 1000) {
			//code here  for DAO
			player = playerSearchDAO.getPlayerById(id);
		} else {
			throw new BusinessException("Entered Player Id " +id+ " is INVALID......");
		}
		
		
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		Player player = null;
		String str = Long.toString(contact);
		if (str != null && str.matches("[0-9]{10}")) {
			//code here  for DAO
			player = playerSearchDAO.getPlayerByContact(contact);
		} else {
			throw new BusinessException("Entered Player Contact " +contact+ " is INVALID......");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		List<Player> genderPlayersList = null;
		if (gender != null && gender.matches("[M,F]{1}")) {
			genderPlayersList = playerSearchDAO.getPlayersByGender(gender);
		} else {
			throw new BusinessException("Entered Gender " +gender+ " is INVALID");
		}
		
		return genderPlayersList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		List<Player> namePlayersList = null;
		if (name != null && name.matches("[a-zA-Z]{4,20}")) {
			namePlayersList = playerSearchDAO.getPlayersByName(name);
		} else {
			throw new BusinessException("Entered Name " +name+ " is INVALID");
		}
		
		return namePlayersList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException {
		List<Player> teamPlayersList = null;
		if (teamname != null && teamname.matches("[a-zA-Z]{5,20}")) {
			teamPlayersList = playerSearchDAO.getPlayersByTeamName(teamname);
		} else {
			throw new BusinessException("Entered TeamName " +teamname+ " is INVALID");
		}
		
		return teamPlayersList;
	}

	@Override
	public List<Player> getPlayersByDob(String dob) throws BusinessException {
		List<Player> dobPlayersList = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/MM/dd").withResolverStyle(ResolverStyle.STRICT);
		DateValidator validator = new DateValidator(formatter);
		
		if (dob != null && validator.isValidDate(dob)) {
			dobPlayersList = playerSearchDAO.getPlayersByDob(dob);
		} else {
			throw new BusinessException("Entered DOB " +dob+ " is INVALID");
		}
		
		return dobPlayersList;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> allPlayersList;
		
		allPlayersList = playerSearchDAO.getAllPlayers();
		
		if (allPlayersList != null && allPlayersList.size() > 0) {
		return allPlayersList;
		} else {
			throw new BusinessException("Players cannot be null");
		}
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> agePlayersList = null;
		if (age > 19 && age < 40) {
			agePlayersList = playerSearchDAO.getPlayersByAge(age);
		} else {
			throw new BusinessException("Entered Player Age " +age+ " is INVALID");
		}
		
		return agePlayersList;
	}

}
