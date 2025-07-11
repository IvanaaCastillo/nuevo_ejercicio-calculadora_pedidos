package com.ejemplo;

public class DiscountService {
    public double getRate(String code) {
        if ("SALES10".equals(code)) {
            return 0.10;
        }
        return 0.0;
    }
}
