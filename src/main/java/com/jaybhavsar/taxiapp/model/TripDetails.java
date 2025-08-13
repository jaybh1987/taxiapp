package com.jaybhavsar.taxiapp.model;

import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

public record TripDetails(@RequestParam Timestamp startTime, @RequestParam Timestamp endTime,
		@RequestParam String carNumber, @RequestParam Integer beforeTripKilometers,
		@RequestParam Integer afterTripKilometers, @RequestParam(required = false) double perKilometerRate) { }
