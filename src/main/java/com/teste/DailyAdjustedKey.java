package com.teste;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DailyAdjustedKey implements Serializable {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "symbol")
    private String symbol;
}
