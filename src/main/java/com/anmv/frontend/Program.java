package com.anmv.frontend;

import com.anmv.backend.presentation_layer.StudentController;
import com.anmv.entity.BrSE2305;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("Demo 3 Layer Architecture");
        StudentController controller = new StudentController();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập mật khẩu !!!");
        String token = scanner.nextLine();

        List<BrSE2305> listStudent = controller.getListStudent(token);

        if (listStudent == null){
            System.out.println("Không có dữ liệu, hoặc xác thực chưa thành công !!!");
        } else {
            System.out.println("Xác thực thành công, bạn được phép xem danh sách");
            for (BrSE2305 brSE2305 : listStudent){
                System.out.println(brSE2305);
            }
        }
    }
}
