package com.jjy.oop_study_projects.movie_reservation;

import com.jjy.oop_study_projects.common.Money;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Reservation {
    private Screening screening;
    private Customer customer;
    private int audienceCount;
    private Money fee;

}
