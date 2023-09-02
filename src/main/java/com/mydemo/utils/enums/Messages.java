package com.mydemo.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Messages {
    SUCCESSFUL_PURCHASE_MESSAGE(" Your order has been dispatched and will arrive as fast as the pony gallops!");

    private final String message;
}
