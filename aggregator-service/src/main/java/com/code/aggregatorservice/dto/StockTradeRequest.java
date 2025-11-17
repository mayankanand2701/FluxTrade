package com.code.aggregatorservice.dto;

import com.code.aggregatorservice.domain.Ticker;
import com.code.aggregatorservice.domain.TradeAction;

public record StockTradeRequest(Ticker ticker,
                                Integer price,
                                Integer quantity,
                                TradeAction action) {
}
