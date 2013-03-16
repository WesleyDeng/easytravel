package com.armandorv.easytravel.web.vmodel;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;

import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BrokenDomainRuleException;

@ManagedBean
public class TravelsTableViewModel {

	private Collection<Travel> travels = new ArrayList<>();

	private Travel selected;
	
	public TravelsTableViewModel(){
		Travel travel = new Travel();
		travel.setName("Test travel");
		travel.setSummary("A great travel");
		try {
			travel.markAsDone();
		} catch (BrokenDomainRuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		travels.add(travel);
	}
	
	public Collection<Travel> getTravels() {
		return travels;
	}

	public void setTravels(Collection<Travel> travels) {
		this.travels = travels;
	}

	public Travel getSelected() {
		return selected;
	}

	public void setSelected(Travel selected) {
		this.selected = selected;
	}
}
