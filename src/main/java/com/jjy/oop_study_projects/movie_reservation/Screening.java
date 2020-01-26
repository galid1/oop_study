package com.jjy.oop_study_projects.movie_reservation;

import com.jjy.oop_study_projects.common.Money;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
public class Screening {
    private Movie movie;
    private int sequence;
    @Getter
    private LocalDateTime whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(this, customer, audienceCount, this.calculateFee(audienceCount));
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateFee(this).times(audienceCount);
    }

    public Money getMovieFee() {
        return this.movie.getFee();
    }
}
