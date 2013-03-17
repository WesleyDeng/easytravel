package com.armandorv.easytravel.web.application.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.armandorv.easytravel.business.domain.Travel;
import com.armandorv.easytravel.business.exception.BrokenDomainRuleException;

@Component
@Scope("request")
public class TravelsBean {

	private Collection<Travel> travels = new ArrayList<>();

	private Travel selected;
	
	public TravelsBean(){
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
