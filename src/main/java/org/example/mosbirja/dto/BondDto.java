package org.example.mosbirja.dto;

import lombok.Value;

@Value
public class BondDto {
    String ticker;
    String name;
    Double price;
}