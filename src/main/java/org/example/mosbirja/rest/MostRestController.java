package org.example.mosbirja.rest;

import lombok.RequiredArgsConstructor;
import org.example.mosbirja.dto.FigiesDto;
import org.example.mosbirja.dto.StocksDto;
import org.example.mosbirja.dto.StocksPricesDto;
import org.example.mosbirja.dto.TickersDto;
import org.example.mosbirja.service.BondService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bonds")
@RequiredArgsConstructor
public class MostRestController {

    private final BondService bondService;

    @PostMapping("/getBondsByTickers")
    public StocksDto getBondsFromMoex(@RequestBody TickersDto tickersDto) {
        return bondService.getBondsFromMoex(tickersDto);
    }

    @PostMapping("/prices")
    public StocksPricesDto getPricesByFigies(@RequestBody FigiesDto figiesDto) {
        return bondService.getPricesByFigies(figiesDto);
    }
}
