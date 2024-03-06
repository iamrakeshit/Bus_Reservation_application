package com.reservationapp.controller;

import com.reservationapp.payload.BusDto;
import com.reservationapp.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//      http://localhost:8080/api/v1/bus
@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    @Autowired
    private BusService busService;
    //      http://localhost:8080/api/v1/bus/add
    @PostMapping("/add")
    public ResponseEntity<BusDto> addBus(@RequestBody BusDto busDto) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date fromDate = formatter.parse(busDto.getFromDate());
        Date toDate = formatter.parse(busDto.getToDate());

        BusDto dto = busService.addBus(busDto);
        return  new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}

//          38 min 04.03.2024