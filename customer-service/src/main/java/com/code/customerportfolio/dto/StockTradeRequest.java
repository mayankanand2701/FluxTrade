package com.code.customerportfolio.dto;

import com.code.customerportfolio.domain.Ticker;
import com.code.customerportfolio.domain.TradeAction;

public record StockTradeRequest(Ticker ticker,
                                Integer price,
                                Integer quantity,
                                TradeAction action) {

    public Integer totalPrice(){
        return price * quantity;
    }
}
