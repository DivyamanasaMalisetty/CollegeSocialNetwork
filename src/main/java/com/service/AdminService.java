

	package com.service;

	import java.util.List;

import com.entity.Admin;
import com.entity.PlacementOfficer;

	public interface AdminService {
		String  addAdmin(Admin Admin);
	    List<Admin> getAdmins();
		boolean deleteAdmin(Long AdminId);
		Admin getAdmin(Long id);
	    String updateAdmin(Admin Admin);
	    List<Admin> getAllAdmins();

	}


