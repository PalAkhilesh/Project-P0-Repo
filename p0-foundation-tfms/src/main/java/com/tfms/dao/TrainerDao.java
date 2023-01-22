package com.tfms.dao;
import com.tfms.model.Trainer;

public interface TrainerDao {
	  public abstract void  addTrainer() throws Exception;
	    public  abstract void showTrainer() throws Exception;
	    public abstract void deleteTrainer() throws Exception;
	    public abstract void updateTrainer() throws Exception;
}
