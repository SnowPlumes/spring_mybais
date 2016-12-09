package me.lv.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.lv.ssm.pojo.Player;
import me.lv.ssm.service.PlayerService;

@Controller
@RequestMapping("player")
public class PlayerContoeller {

	@Autowired
	private PlayerService playerService;

	@RequestMapping("/showPlayer")
	public String showPlayer(Model model) {
		Player player = this.playerService.getPlayerById(1);
		model.addAttribute("player", player);
		return "showplayer";
	}
}
