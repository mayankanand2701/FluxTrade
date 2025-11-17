package com.code.aggregatorservice.dto;

import com.code.aggregatorservice.domain.Ticker;

import java.time.LocalDateTime;

public record PriceUpdate(Ticker ticker,
                          Integer price,
                          LocalDateTime time) {
}
