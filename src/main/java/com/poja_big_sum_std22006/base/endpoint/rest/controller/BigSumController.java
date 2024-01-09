package com.poja_big_sum_std22006.base.endpoint.rest.controller;

import com.poja_big_sum_std22006.base.service.BigSumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@AllArgsConstructor
public class BigSumController {
    BigSumService bigSumService;

    @GetMapping("/big-sum?a={input1}&b={input2}")
    public BigInteger calculateBigSum(@PathVariable String input1, @PathVariable String input2) {
        return bigSumService.calculateBigSum(input1, input2);
    }
}
