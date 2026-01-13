package com.contabil.core.domain;

import java.math.BigDecimal;

public record ValorContabil(BigDecimal valor) {
    public ValorContabil {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("O valor contábil deve ser maior que zero.");
    }

    public static ValorContabil de(double valor) { return new ValorContabil(BigDecimal.valueOf(valor)); }
}