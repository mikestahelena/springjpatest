package com.teste;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TesteController {

    private final TesteRepository testeRepository;

    @GetMapping("{symbol}/all")
    public List<DailyAdjusted> allBySymbol(@PathVariable String symbol) {
        return testeRepository.findAllByDailyAdjustedKeySymbol(symbol);
    }

    @GetMapping("{symbol}/{page}")
    public List<DailyAdjusted> page(@PathVariable String symbol, @PathVariable Integer page) {
        Pageable sortedByDate = PageRequest.of(page, 100, Sort.by("dailyAdjustedKey.date"));
        return testeRepository.findAllByDailyAdjustedKeySymbol(symbol, sortedByDate);
    }

    @GetMapping("{symbol}")
    public List<DailyAdjusted> page(@PathVariable String symbol, Pageable page) {
        //?page=0&size=100&sort=dailyAdjustedKey.date,ASC
        return testeRepository.findAllByDailyAdjustedKeySymbol(symbol, page);
    }

}
