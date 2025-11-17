package com.code.aggregatorservice.dto;

import com.code.aggregatorservice.domain.Ticker;

public record Holding(Ticker ticker,
                      Integer quantity) {
}
