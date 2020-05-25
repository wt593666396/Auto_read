package cource.auto_read;

import cource.auto_read.StuService;
import cource.auto_read.StudentMapper;
import javabean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StuServiceimpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStuList() {
        List<Student> students = studentMapper.getStuList();
        return students;
    }
}