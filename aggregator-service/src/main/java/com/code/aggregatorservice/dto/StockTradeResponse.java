package com.code.aggregatorservice.dto;

import com.code.aggregatorservice.domain.Ticker;
import com.code.aggregatorservice.domain.TradeAction;

public record StockTradeResponse(Integer customerId,
                                 Ticker ticker,
                                 Integer price,
                                 Integer quantity,
                                 TradeAction action,
                                 Integer totalPrice,
                                 Integer balance) {
}
