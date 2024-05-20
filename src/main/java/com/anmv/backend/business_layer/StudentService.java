package com.anmv.backend.business_layer;

import com.anmv.backend.data_layer.IStudentRepository;
import com.anmv.backend.data_layer.StudentRepository;
import com.anmv.entity.BrSE2305;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    @Override
    public List<BrSE2305> getListStudents() throws SQLException, IOException {
        return repository.getListStudents();
    }
}
