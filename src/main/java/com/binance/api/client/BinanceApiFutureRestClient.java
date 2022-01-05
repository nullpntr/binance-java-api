package com.binance.api.client;

import com.binance.api.client.domain.FutureTransferType;
import com.binance.api.client.domain.account.FutureTransaction;
import java.math.BigDecimal;

public interface BinanceApiFutureRestClient {

  /**
   * Execute transfer between spot account and future account
   *
   * @param asset  asset to transfer
   * @param amount amount to transfer
   * @return transaction id
   */
  FutureTransaction transfer(String asset, BigDecimal amount, FutureTransferType type);

}
