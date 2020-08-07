package com.teste;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TesteRepository extends PagingAndSortingRepository<DailyAdjusted, DailyAdjustedKey> {

    List<DailyAdjusted> findAllByDailyAdjustedKeySymbol(String symbol);

    List<DailyAdjusted> findAllByDailyAdjustedKeySymbol(String symbol, Pageable pageable);
}
