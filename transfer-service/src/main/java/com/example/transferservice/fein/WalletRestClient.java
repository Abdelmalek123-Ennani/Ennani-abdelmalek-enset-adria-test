package com.example.transferservice.fein;


@FeignClient(name = "wallet-SERVICE")
public interface WalletRestClient {
    @GetMapping(path = "/wallet/{id}")
    Costumer getWalletById(@PathVariable(name = "id") Long id);
}
