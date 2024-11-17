package com.kafkaproducer.InstalikeManagement.utility;

public class LikeUtility {
	

	 public Boolean isNullOrEmpty(String contain)
	 {
		 if(null==contain || contain.isEmpty() || contain.isBlank() || contain.length()==0 || contain.equalsIgnoreCase("null"))
			 return true;
		 else
			 return false;
	 }

}
