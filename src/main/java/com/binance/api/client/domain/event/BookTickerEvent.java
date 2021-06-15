package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * BookTickerEvent event for a symbol. Pushes any update to the best bid or
 * ask's price or quantity in real-time for a specified symbol.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookTickerEvent {

    @JsonProperty("u")
    private long updateId;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("b")
    private BigDecimal bidPrice;

    @JsonProperty("B")
    private BigDecimal bidQuantity;

    @JsonProperty("a")
    private BigDecimal askPrice;

    @JsonProperty("A")
    private BigDecimal askQuantity;

    public BookTickerEvent() {
        super();
    }

    public BookTickerEvent(long updateId, String symbol, BigDecimal bidPrice, BigDecimal bidQuantity, BigDecimal askPrice,
        BigDecimal askQuantity) {
        super();
        this.updateId = updateId;
        this.symbol = symbol;
        this.bidPrice = bidPrice;
        this.bidQuantity = bidQuantity;
        this.askPrice = askPrice;
        this.askQuantity = askQuantity;
    }

    public BookTickerEvent(String symbol, BigDecimal bidPrice, BigDecimal bidQuantity, BigDecimal askPrice, BigDecimal askQuantity) {
        super();
        this.symbol = symbol;
        this.bidPrice = bidPrice;
        this.bidQuantity = bidQuantity;
        this.askPrice = askPrice;
        this.askQuantity = askQuantity;
    }

    public long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(long updateId) {
        this.updateId = updateId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    public BigDecimal getBidQuantity() {
        return bidQuantity;
    }

    public void setBidQuantity(BigDecimal bidQuantity) {
        this.bidQuantity = bidQuantity;
    }

    public BigDecimal getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(BigDecimal askPrice) {
        this.askPrice = askPrice;
    }

    public BigDecimal getAskQuantity() {
        return askQuantity;
    }

    public void setAskQuantity(BigDecimal askQuantity) {
        this.askQuantity = askQuantity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", "BookTicker")
                .append("updateId", updateId).append("symbol", symbol).append("bidPrice", bidPrice)
                .append("bidQuantity", bidQuantity).append("askPrice", askPrice).append("askQuantity", askQuantity)
                .toString();
    }
}