package com.binance.api.client.impl;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

import com.binance.api.client.BinanceApiFutureRestClient;
import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.FutureTransferType;
import com.binance.api.client.domain.account.FutureTransaction;
import java.math.BigDecimal;

public class BinanceApiFutureRestClientImpl implements BinanceApiFutureRestClient {

  private final BinanceApiService binanceApiService;

  public BinanceApiFutureRestClientImpl(String apiKey, String secret) {
    binanceApiService = createService(BinanceApiService.class, apiKey, secret);
  }

  @Override
  public FutureTransaction transfer(String asset, BigDecimal amount, FutureTransferType type) {
    long timestamp = System.currentTimeMillis();
    return executeSync(binanceApiService.transferFutures(asset, amount, type.getValue(),
        BinanceApiConstants.DEFAULT_RECEIVING_WINDOW, timestamp));
  }

}