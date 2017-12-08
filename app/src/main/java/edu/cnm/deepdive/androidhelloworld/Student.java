package edu.cnm.deepdive.androidhelloworld;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

  private Long id;

  private String last_name;

  private String first_name;

  //private Classroom classroom;

  public Student() {
  }

  public Student(String last_name, String first_name) {
    this.last_name = last_name;
    this.first_name = first_name;
  }

  public Long getId() {
    return id;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getFirst_name() {
    return first_name;
  }

  //public Classroom getClassroom() {
  //  return classroom;
  //}

  //public void setClassroom(Classroom classroom) {
  //  this.classroom = classroom;
  //}

}
