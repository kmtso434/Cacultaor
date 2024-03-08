package com.example.level4.kt

import com.example.level4.AbstractOperation
import java.math.BigDecimal

class SubstractOperation : AbstractOperation() {
    override fun operate(num1: BigDecimal, num2: BigDecimal): BigDecimal {
        return num1 - num2
    }
}