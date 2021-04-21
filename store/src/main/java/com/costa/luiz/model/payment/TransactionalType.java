package com.costa.luiz.model.payment;

/**
 * The TransactionType class is a virtual enum class that represents the type of transaction being performed with a payment service.
 */
public enum TransactionalType {

    NONE,
    AUTHORIZE,
    REAUTHORIZE,
    CAPTURE,
    IMMEDIATE_CAPTURE,
    REVERSAL,
    REFUND
}
