package com.hugcode.managementsystem.service;

import com.hugcode.managementsystem.pojo.StudentCourse;

import java.util.HashMap;
import java.util.List;

public interface StudentCourseService {
    boolean deleteBySidList(List<String> sids);

    boolean deleteStudentCourse(String sid, String cid);
    boolean deleteStudentCourseList(String sid,List<String>cids);

    boolean updateGrade(String sid, String cid, Double newGrade);

    boolean addStudentCourse(String sid, String cid);

    HashMap<String,Double> getCreditsMap(String sid);


    boolean addCourseListToStudent(String sid, List<String> cids);

    boolean deleteCourseList(List<String> cids);

    List<StudentCourse> selectByCondition(String sid, StudentCourse studentCourse);
}
