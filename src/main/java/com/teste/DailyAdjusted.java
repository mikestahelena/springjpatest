package com.teste;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "DAILY_ADJUSTED")
public class DailyAdjusted implements Serializable {

    @EmbeddedId
    private DailyAdjustedKey dailyAdjustedKey;

    @Column(name = "open")
    private BigDecimal open;

    @Column(name = "high")
    private BigDecimal high;

    @Column(name = "low")
    private BigDecimal low;

    @Column(name = "close")
    private BigDecimal close;

    @Column(name = "adjusted_close")
    private BigDecimal adjustedClose;

    @Column(name = "volume")
    private Long volume;

    @Column(name = "dividend_amount")
    private BigDecimal dividendAmount;

    @Column(name = "split_coefficient")
    private BigDecimal splitCoefficient;
}
