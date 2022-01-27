package com.hua;

public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    public int getCode() {
        return code;
    }

    private final int code;

    Level(int code) {
        this.code = code;
    }
}
