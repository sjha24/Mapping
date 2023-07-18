package com.saurav.MappingPractice.service;

import com.saurav.MappingPractice.model.Student;
import com.saurav.MappingPractice.repository.IAddressRepo;
import com.saurav.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        if(student != null){
            studentRepo.save(student);
            return "Student is saved in our database";
        }
        return "Database Error !!!";
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentByID(Integer studentID) {
        return studentRepo.findByStudentID(studentID);
    }

    public String updateStudentByID(Integer studentID, Student student) {
        if(studentRepo.existsById(studentID)){
            Student oldStudent = studentRepo.findByStudentID(studentID);
            oldStudent.setStudentName(student.getStudentName());
            oldStudent.setStudentAge(student.getStudentAge());
            oldStudent.setStudentPhoneNumber(student.getStudentPhoneNumber());
            oldStudent.setStudentBranch(student.getStudentBranch());
            oldStudent.setStudentDepartment(student.getStudentDepartment());
            studentRepo.save(oldStudent);
            return "Student updated successfull";
        }
        return "Please Enter valid StudentID";
    }

    public String deleteStudentByID(Integer studentID) {
        if(studentRepo.existsById(studentID)){
            studentRepo.deleteById(studentID);
            return "Student of this id "+studentID +" deleted successfully from our database";
        }
        return "Please Enter valid Student ID";
    }
}
