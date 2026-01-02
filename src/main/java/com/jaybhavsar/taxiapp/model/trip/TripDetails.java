package com.jaybhavsar.taxiapp.model.trip;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public record TripDetails(
        @FutureOrPresent
        @NotNull
        @JsonFormat( pattern = "yyyy-MM-dd hh:mm a")
        LocalDateTime startDate,

        @FutureOrPresent
        @NotNull
        @JsonFormat( pattern = "yyyy-MM-dd hh:mm a")
        LocalDateTime endDate,

        @Nullable
        String description,

        @NotNull
        String carName,

        @Nullable
        Double amountReceivable
) { }
