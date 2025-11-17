package com.code.aggregatorservice.dto;

import com.code.aggregatorservice.domain.Ticker;
import com.code.aggregatorservice.domain.TradeAction;

public record TradeRequest(Ticker ticker,
                           TradeAction action,
                           Integer quantity) {
}