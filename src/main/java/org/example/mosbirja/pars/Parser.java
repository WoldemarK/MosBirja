package org.example.mosbirja.pars;

import org.example.mosbirja.dto.BondDto;

import java.util.List;

public interface Parser {
    List<BondDto> parse(String ratesAsString);
}
