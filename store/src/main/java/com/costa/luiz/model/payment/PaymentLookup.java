package com.costa.luiz.model.payment;

import java.util.List;

/**
 * The PaymentLookup class is used to hold the information required to lookup payment prices for a collection of line items.
 */
public class PaymentLookup {

    private String optionId;
    private String methodId;
    private List<String> lineItemsId;

}
