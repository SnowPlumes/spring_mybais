package me.lv.sm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lv.sm.dao.PlayerDao;
import me.lv.sm.pojo.Player;
import me.lv.sm.service.PlayerService;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	public Player getPlayerById(int id) {
		return playerDao.selectByPrimaryKey(id);
	}

}
