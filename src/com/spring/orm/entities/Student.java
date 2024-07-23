package com.spring.orm.entities;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table( appliesTo = " student_details")
public class Student {
	
   @Column(name="student_Id")
	private int studentId;
	private String studentName;
	private String studentCity;

}
