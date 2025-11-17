package com.code.aggregatorservice.dto;

import com.code.aggregatorservice.domain.Ticker;

public record StockPriceResponse(Ticker ticker,
                                 Integer price) {
}