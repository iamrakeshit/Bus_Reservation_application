package com.reservationapp.payload;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {
    private Long busId;
    @Column(name="bus_number", unique = true)
    private String busNumber;
    private String busType;
    private String from;
    private String to;
    private Date fromDate; // Changed to Date type
    private Date toDate;   // Changed to Date type
    private int totalDuration;
    private String fromTime;
    private String toTime;
    private double price;
    private int totalSeats;
    private int availableSeats;
}
