package com.costa.luiz.model.payment;

import java.util.List;

/**
 * The PaymentPrice class inherits from the Price object and is used to hold the pricing information for a payment option, method, and list of line items.
 */
public class PaymentPrice {
    private String optionId;
    private String methodId;
    private List<String> lineItemsId;

}
