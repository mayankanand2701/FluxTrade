package com.code.customerportfolio.dto;

import com.code.customerportfolio.domain.Ticker;

public record Holding(Ticker ticker,
                      Integer quantity) {
}
