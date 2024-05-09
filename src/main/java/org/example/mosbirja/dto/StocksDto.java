package org.example.mosbirja.dto;


import lombok.Value;
import org.example.mosbirja.model.Stock;

import java.util.List;

@Value
public class StocksDto {
    List<Stock> stocks;
}