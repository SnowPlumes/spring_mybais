package me.lv.ssm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.lv.ssm.pojo.Player;
import me.lv.ssm.service.PlayerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private PlayerService playerService;

	@Test
	public void testGetPlayerById() {
		System.out.println(123);
		System.out.println(playerService);
		Player player = playerService.getPlayerById(1);
		System.out.println(player);
	}
}
