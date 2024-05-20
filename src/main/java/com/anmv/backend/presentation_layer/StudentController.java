package com.anmv.backend.presentation_layer;

import com.anmv.backend.business_layer.IStudentService;
import com.anmv.backend.business_layer.StudentService;
import com.anmv.entity.BrSE2305;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private IStudentService service;

    public StudentController() {
        this.service = new StudentService();
    }

    public List<BrSE2305> getListStudents(String request) throws SQLException, IOException {
        // Validate request
        if (request.equals("ABCD1234XYZ")){
            return service.getListStudents();
        }
        return null;
    }
}
