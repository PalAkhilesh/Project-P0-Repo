package com.tfms.constant;

public class Constants {
	public static final String WELCOME_MESSAGE = "*****WELCOME*****";
    
//	This constants are used in Abstract class (model/TrainerDetails)
	public  static final String ENTER_TRAINER_ID = "Enter  Trainer Id: ";
	public  static final String ENTER_TRAINER_NAME = "Enter Trainer  Name: ";

	public  static final String ENTER_TRAINER_TRACK = "Enter Track ";
	public static final String ENTER_TRAINER_QUALIFICATION = "Enter Qualification: ";
	public  static final String ENTER_TRAINER_EXPERIENCE = "Enter Experience: ";

//	This constants are used in Menu class (model/Menu)
	public static final  String SHOWMENU = "************* MENU *************\n";
	public  static final String SHOWMENU_ADD_DETAILS = "Press 1: Add Trainer details";
	public  static final String SHOWMENU_TRAINER_DETAILS = "Press 2: Show Trainer details";
	public  static final String SHOWMENU_DELETE_TRAINERDETAILS = "Press 3: Delete Trainer details";
	public  static final String SHOWMENU_UPDATE_TRAINERDETAILS = "Press 4: Update Trainer details";
	
//	This constants are used in Menu class (model/callMenu)
//	public  static final String MENU = "Press 1: View Menu\nPress 2: Exit";
	public static final String THANKYOU = "********* Thank You *********";

	
//	This constants are used in switch statement of Main Application (model/SWITCH)
	public  static final String SWITCH_ADD_DETAILS = "************* ADD DETAILS *************\n";
	public static final String SWITCH_TRAINER_DETAILS = "************* TRAINER DETAILS *************\n";
	public  static final String SWITCH_DELETE_TRAINER_DETAILS = "************* DELETE TRAINER DETAILS *************\n";
	public  static final String SWITCH_UPDATE_TRAINER_DETAILS = "************* UPDATE TRAINER DETAILS *************\n";
	
// This constant is used for Default
	public  static final String CHECK_KEY = "Please press valid key !";
	
  // This constant is used for checking condition (model/TrainerDetails/ChildTrainerDetails/addDetails()/ do loop)
	public static final String  CHECK_CONDITION_ADD= "If you want to add more data press: 1 or 0 !";
	public  static final String  CHECK_CONDITION_UPDATE= "If you want to update more data press: 1";
	
// This constant is used for checking valid data (model/TrainerDetails/ChildTrainerDetails/addDetails()/do loop/do loop )
	public static final String VALIDATION = "Please Enter Valid Data !";
	public static final String DETAILS_ADDED ="Trainer Details Added";
	
//	SuccessFull message 
	public  static final String SUCCESS = "Successfully done";
	
//	This constants are used in editTrainerDetails() method
	public  static final String SELECT= "Which field you want to update \nPress 1: Update Name\nPress 2: Update Track\nPress 3: Update Qualification\nPress 4: Update Experience\nPress";

	
	public static final String PASSWORD = "Enter the password:-";
	
	public static final String END_MESSAGE = "*****THANK YOU******";
	


}
