package com.tfms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.tfms.app.menu.ShowMenu;
import com.tfms.connectivity.DatabaseConnection;
import com.tfms.constant.Constants;
import com.tfms.dao.TrainerDao;

public class TrainerDaoImpl implements TrainerDao {
	private static final Logger logger=Logger.getLogger(TrainerDaoImpl.class);
	static Connection con = DatabaseConnection.CreateConnection();

	ShowMenu menu = new ShowMenu();
	Constants cons = new Constants();
	Scanner scString = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);
	int condition, id;
	int Check = 0;
	String track;
   
	@Override
	public void addTrainer() throws Exception {
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps1 = con.prepareStatement("insert into trainer values (?,?,?,?,?)");

		logger.info("Enter the trainerID ");
		String tId = sc.nextLine();
		logger.info("Enter Trainer Name: ");
		String tname = sc.nextLine();
		logger.info("Enter Qulification ");
		String tqualification = sc.nextLine();
		logger.info("Enter Experience ");
		String texperience = sc.nextLine();
		logger.info("Enter track ");
		String ttrack = sc.nextLine();

		ps1.setString(1, tId);
		ps1.setString(2, tname);
		ps1.setString(3, tqualification);
		ps1.setString(4, texperience);
		ps1.setString(5, ttrack);

		int k = ps1.executeUpdate();
		if (k > 0) {
			logger.info(Constants.DETAILS_ADDED);
		}
	
	while (condition == 1);

	menu.callMenu();
}

	

	@Override
	public void showTrainer() {
//		 List<Trainer> Trainers = new ArrayList<Trainer>();
//			
		try {
//				Class.forName(className);
//			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select*from trainer");

			while (rs.next()) {
//			   String id=rs.getString(1);
//			   String name=rs.getString(2);
//			   String qulifi=rs.getString(3);
//			   String exper=rs.getString(4);
//			   String track=rs.getString(5);

//			   Trainer tr=new Trainer();
//			   tr.setTrainerId(id);
//			   tr.setTrainerName(name);
//			   tr.setTrainerQualification(qulifi);
//			   tr.setTrainerExperience(exper);
//			   tr.setTrack(track);
//			   Trainers.add(tr);
				logger.info(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3) + " , "
						+ rs.getString(4) + " , " + rs.getString(5));

			}
			if (rs.next() == true) {
				throw new Exception(Constants.CHECK_KEY);
			}

		} catch (Exception e) {
			logger.info(e.getMessage());
		}

//		return Trainers;

	}

	@Override
	public void deleteTrainer() {
		try {
			logger.info("Enter Id of trainer to delete: ");
			String TId = scString.nextLine();
			PreparedStatement ps1 = con.prepareStatement("delete from trainer where trainerId=?");
			ps1.setString(1, TId);
			int k = ps1.executeUpdate();
			if (k > 0) {
				logger.info("Deleted successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			menu.callMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	


	@Override
	public void updateTrainer() throws Exception {

		PreparedStatement ps2;
		System.out.print(Constants.SELECT);
		int press = scInt.nextInt();
		switch (press) {
		case 1:
			try {
				System.out.print(Constants.ENTER_TRAINER_ID);
				String upId = scString.nextLine();
				ps2 = con.prepareStatement("update trainer set trainerName=? where trainerId=?");
				logger.info("Enter new name:");
				String name = scString.nextLine();
				ps2.setString(1, name);
				;
				ps2.setString(2, upId);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not updated");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		case 2:
			try {
				System.out.print(Constants.ENTER_TRAINER_ID);
				String upId = scString.nextLine();
				logger.info("Enter new track:");
				String track = scString.nextLine();
				ps2 = con.prepareStatement("update trainer set track=? where trainerId=?");
				ps2.setString(1, track);
				ps2.setString(2, upId);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not updated");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		case 3:
			try {
				System.out.print(Constants.ENTER_TRAINER_ID);
				String upId = scString.nextLine();
				logger.info("Enter new Qualification:");
				String track = scString.nextLine();
				ps2 = con.prepareStatement("update trainer set qualification=? where trainerId=?");
				ps2.setString(1, track);
				ps2.setString(2, upId);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not updated");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		case 4:
			try {
				System.out.print(Constants.ENTER_TRAINER_ID);
				String upId = scString.nextLine();
				logger.info("Enter new Experience:");
				String track = scString.nextLine();
				ps2 = con.prepareStatement("update trainer set experience=? where trainerId=?");
				ps2.setString(1, track);
				ps2.setString(2, upId);
				int s = ps2.executeUpdate();
				if (s > 0) {
					logger.info("Updated");
				} else {
					logger.info("Not updated");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			logger.info(Constants.CHECK_CONDITION_UPDATE);
			break;
		default:
			logger.info("Press valid key !");
//			logger.info(Constants.CHECK_CONDITION_UPDATE);

			condition = scInt.nextInt();
			} 
	          while (condition == 1);

				menu.callMenu();
			
		}

}
