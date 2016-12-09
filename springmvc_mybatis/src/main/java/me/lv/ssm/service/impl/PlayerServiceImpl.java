package me.lv.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lv.ssm.dao.PlayerDao;
import me.lv.ssm.pojo.Player;
import me.lv.ssm.service.PlayerService;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	public Player getPlayerById(int id) {
		return playerDao.selectByPrimaryKey(id);
	}

}
