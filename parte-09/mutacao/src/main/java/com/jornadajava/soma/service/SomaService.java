package com.jornadajava.soma.service;

import org.springframework.stereotype.Service;

@Service
public class SomaService {

    public int sum(int value1, int value2) {
        return value1 + value2;
    }
}
