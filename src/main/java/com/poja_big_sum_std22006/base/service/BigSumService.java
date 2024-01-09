package com.poja_big_sum_std22006.base.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@AllArgsConstructor
@Slf4j
public class BigSumService {
    public BigInteger calculateBigSum(String input1, String input2) {
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);

        return a.add(b);
    }
}
