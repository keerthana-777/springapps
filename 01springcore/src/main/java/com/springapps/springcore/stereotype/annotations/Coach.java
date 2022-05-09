package com.springapps.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("supercoach")
@Scope("prototype")
public class Coach {

	@Value("11")
	int id = 9;

	@Value("Max")
	String name;

	@Value("${dbuser}")
	private String dbuser;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private CoachProfile coachProfile;
	
//	public Coach(CoachProfile coachProfile) {
//		this.coachProfile = coachProfile;
//		
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}

	public List<String> getTopics() {
		return topics;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbuser=" + dbuser + ", topics=" + topics + ", profile="
				+ coachProfile + "]";
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public CoachProfile getProfile() {
		return coachProfile;
	}

	public void setProfile(CoachProfile profile) {
		this.coachProfile = profile;
	}

}
