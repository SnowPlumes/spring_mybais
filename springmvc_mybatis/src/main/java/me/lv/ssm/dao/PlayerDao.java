package me.lv.ssm.dao;

import me.lv.ssm.pojo.Player;

public interface PlayerDao {
	Player selectByPrimaryKey(int id);
}
