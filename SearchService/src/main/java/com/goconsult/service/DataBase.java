package com.goconsult.service;

import com.goconsult.grpc.Slots;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    final static String URL = "jdbc:postgresql://localhost:5432/GoConsult";
    final static String USERNAME = "postgres";
    final static String PASSWORD = "akanksha";

    public static List<Slots.Slot> searchAllAvailableSlotFromDb() {

        List<Slots.Slot> listOfSlot=new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);)
        {
            if (conn != null) {
                PreparedStatement ps=conn.prepareStatement("SELECT slot_id ,COUNSELOR.counselor_name,COUNSELOR.contact,COUNSELOR.fees,COUNSELOR.specialization, date,from_time,to_time FROM SLOT  \n" +
                              "   RIGHT JOIN COUNSELOR ON COUNSELOR.counselor_id=SLOT.counselor_id WHERE  \n" +
                              "   slot_id not in (select slot_id from booking)");
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Slots.Slot.Builder data=Slots.Slot.newBuilder() .setSlotId(rs.getInt(1))
                            .setCounselorName(rs.getString(2)).setCounselorContact(rs.getString(3))
                            .setFees(rs.getInt(4)).setSpecialization(rs.getString(5)).setDate(String.valueOf(rs.getDate(6)))
                            .setFromTime(String.valueOf(rs.getTime(7))).setToTime(String.valueOf(rs.getTime(8)));

                    listOfSlot.add(data.build());
                }
            }
            else {
                System.out.println("Failed to make connection!");
            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }

        return listOfSlot;

    }


}