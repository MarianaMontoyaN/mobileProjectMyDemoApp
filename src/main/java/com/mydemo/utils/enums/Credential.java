package com.mydemo.utils.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Credential {
    RIGHT_CREDENTIALS("bob@example.com", "10203040"),
    WRONG_CREDENTIALS("bobi@example.com", "10203111"),
    BLOCKED_CREDENTIALS("alice@example.com", "10203040");

    private final String username;
    private final String password;
}
