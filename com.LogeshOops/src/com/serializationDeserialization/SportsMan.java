package com.serializationDeserialization;

import java.io.Serializable;

public class SportsMan implements Serializable {
private String name;
private String type;
private String gender;
private String team;
private int rank;
transient private float bmi;

public SportsMan(String name, String team, String type, String gender, int rank, float bmi) {
	this.name = name;
	this.type = type;
	this.gender = gender;
	this.team = team;
	this.rank = rank;
	this.bmi = bmi;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public int getRank() {
	return rank;
}

public void setRank(int rank) {
	this.rank = rank;
}

public float getBmi() {
	return bmi;
}

public void setBmi(int bmi) {
	this.bmi = bmi;
}

@Override
public String toString() {
	return "SportsMan [name=" + name + ", type=" + type + ", gender=" + gender + ", team=" + team + ", rank=" + rank
			+ ", bmi=" + bmi + "]";
}

}
