package com.payment.v2.Payment.Application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAccountBalanceRequest {

    private String accountNumber;
    private double accountBalance;

}
