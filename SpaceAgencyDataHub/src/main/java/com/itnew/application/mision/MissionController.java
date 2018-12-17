package com.itnew.application.mision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lukasz Nowicki
 *
 */
@RestController
public class MissionController {
	
	@Autowired
	private MissionService missionService;
	
	@RequestMapping("/missions")
	public List<Mission> getAllMissions() {
		return missionService.getAllMissions();
	}
	
	public String addMission() {
		
		return "";
	}
	
	public String editMission() {
		
		return "";
	}
	
	public String removeMission() {
		
		return "";
	}
}
