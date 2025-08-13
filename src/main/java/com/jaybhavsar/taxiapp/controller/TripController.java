package com.jaybhavsar.taxiapp.controller;


import com.jaybhavsar.taxiapp.model.TripDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalTime;

@RestController
public class TripController {

	@GetMapping("/v1/tripdetails")
	public TripDetails insertTripDetails() {

        Instant n = Instant.now();
        Timestamp start =  Timestamp.from(n);
        Timestamp end =  Timestamp.from(n);

        return new TripDetails(
                start,
                end,
                "GJ06LK5599",
                100,
                200,
                20
        );
	}

}
