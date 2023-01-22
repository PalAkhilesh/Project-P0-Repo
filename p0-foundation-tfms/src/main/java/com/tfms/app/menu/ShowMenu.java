package com.tfms.app.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.tfms.constant.Constants;
import com.tfms.dao.impl.TrainerDaoImpl;
//import com.tfms.dao.TrainerDao;
import com.tfms.model.Trainer;

public class ShowMenu {
	private static final Logger logger = Logger.getLogger(ShowMenu.class);
	Scanner scInt = new Scanner(System.in);

	Scanner sc = new Scanner(System.in);
	Constants constant = new Constants();

	public void showList() throws Exception {

		TrainerDaoImpl service = new TrainerDaoImpl();
        logger.info(constant.WELCOME_MESSAGE);
		logger.info(constant.SHOWMENU_ADD_DETAILS);
		logger.info(constant.SHOWMENU_TRAINER_DETAILS);
		logger.info(constant.SHOWMENU_DELETE_TRAINERDETAILS);
		logger.info(constant.SHOWMENU_UPDATE_TRAINERDETAILS);

		int press = scInt.nextInt();
		switch (press) {
		case 1:
			logger.info(constant.SWITCH_ADD_DETAILS);
			service.addTrainer();
			;
			break;
		case 2:
			logger.info(constant.SWITCH_TRAINER_DETAILS);
			service.showTrainer();
			;
			break;
		case 3:
			logger.info(constant.SWITCH_DELETE_TRAINER_DETAILS);
			service.deleteTrainer();;
			break;
		case 4:
			logger.info(constant.SWITCH_UPDATE_TRAINER_DETAILS);
			service.updateTrainer();
			;
			break;
		default:
			logger.info(constant.CHECK_KEY);
		}
	}

	public void callMenu() throws Exception {
		logger.info(constant.SHOWMENU);
		int press = scInt.nextInt();
		if (press == 1) {
			ShowMenu menu = new ShowMenu();
			menu.showList();
			;
		} else {
			logger.info(constant.THANKYOU);
		}
	}

}
