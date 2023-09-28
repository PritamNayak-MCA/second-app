package com.tcs.sbi;

import in.pritam.security.PwdSecurityService;

public class UserReg {

	public static void main(String[] args) {
		PwdSecurityService pss=new PwdSecurityService();
		String encode=pss.encode("pritam");
		System.out.println(encode);

	}

}
