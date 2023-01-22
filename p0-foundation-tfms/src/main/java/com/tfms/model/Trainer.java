package com.tfms.model;

public class Trainer {
	private String trainerId;
	private String trainerName;
	private String trainerQualification;
	private String trainerExperience;
	private String track;
	
	
	public Trainer() {
		super();
		
	}

	public Trainer(String trainerId, String trainerName, String trainerQualification, String trainerExperience,
			String track) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerQualification = trainerQualification;
		this.trainerExperience = trainerExperience;
		this.track = track;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getTrainerQualification() {
		return trainerQualification;
	}

	public void setTrainerQualification(String trainerQualification) {
		this.trainerQualification = trainerQualification;
	}

	public String getTrainerExperience() {
		return trainerExperience;
	}

	public void setTrainerExperience(String trainerExperience) {
		this.trainerExperience = trainerExperience;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerQualification="
				+ trainerQualification + ", trainerExperience=" + trainerExperience + ", track=" + track + "]";
	}

	

}
