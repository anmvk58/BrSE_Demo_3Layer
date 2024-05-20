package com.anmv.backend.business_layer;

import com.anmv.backend.data_layer.StudentRepository;
import com.anmv.entity.BrSE2305;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository();
    }

    public List<BrSE2305> getListStudent() throws SQLException, IOException {
        return repository.getListStudents();
    }
}
