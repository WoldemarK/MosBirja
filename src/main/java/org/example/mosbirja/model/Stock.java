package org.example.mosbirja.model;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
public record Stock(String ticker,
                    String figi,
                    String name,
                    String type,
                    Currency currency,
                    String source) implements Serializable {


}
