package me.lv.sm.dao;

import me.lv.sm.pojo.Player;

public interface PlayerDao {
	Player selectByPrimaryKey(int id);
}
