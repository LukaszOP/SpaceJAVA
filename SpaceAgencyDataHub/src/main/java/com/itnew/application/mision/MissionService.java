/**
 * 
 */
package com.itnew.application.mision;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itnew.application.ImageryType;

/**
 * @author Lukasz Nowicki
 *
 */
@Service
public class MissionService {

	private List<Mission> missions = Arrays.asList(
			new Mission("Misja na Marsa", ImageryType.PANCHROMATIC, new Date(), new Date()),
			new Mission("Misja na Jowisza", ImageryType.PANCHROMATIC, new Date(), new Date()),
			new Mission("Misja na Saturna", ImageryType.PANCHROMATIC, new Date(), new Date())
			);
	
	public List<Mission> getAllMissions() {
		return missions;
	}
			
}
