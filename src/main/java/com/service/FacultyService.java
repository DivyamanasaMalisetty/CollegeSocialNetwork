

package com.service;

import java.util.List;


import com.entity.Faculty;


public interface FacultyService {
	String  addFaculty(Faculty Faculty);
    //List<Faculty> getFaculty();
	boolean deleteFaculty(Long FacultyId);
	Faculty getFaculty(Long id);
    String updateFaculty(Faculty Faculty);
    List<Faculty> getAllFaculty();

}


