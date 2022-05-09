package com.springapps.springcore.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CoachProfile {
	
	@Value("Cricket Coach")
	String title;
	
	@Value("XYZ Coaching company")
	String company;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "CoachProfile [title=" + title + ", company=" + company + "]";
	}

}
