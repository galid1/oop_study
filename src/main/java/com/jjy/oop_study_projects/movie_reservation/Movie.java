package com.jjy.oop_study_projects.movie_reservation;

import com.jjy.oop_study_projects.common.Money;
import com.jjy.oop_study_projects.movie_reservation.discount.policy.DiscountPolicy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Duration;

@AllArgsConstructor
@Builder
public class Movie {
    private String title;
    private Duration runningTime;
    @Getter
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Money calculateFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
