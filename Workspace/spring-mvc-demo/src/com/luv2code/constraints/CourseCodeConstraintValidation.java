package com.luv2code.constraints;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String>{

	private String prefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		prefix = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		if (theCode != null) {
		
					
			try {

			} catch (Exception e) {
			
			}
			
			
			
			return theCode.startsWith(prefix);
			
			
			

			
			
		} else {
			return false;
		}
	}

}
