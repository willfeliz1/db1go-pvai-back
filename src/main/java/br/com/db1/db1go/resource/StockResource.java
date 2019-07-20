package br.com.db1.db1go.resource;

import br.com.db1.db1go.domain.dto.StockDTO;
import br.com.db1.db1go.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StockResource {

    @Autowired
    private StockService stockService;


    @GetMapping("/api/v1/stock")
    public List<StockDTO> getAll() {
        return stockService.getAll();
    }
    
    @PostMapping("/api/v1/stock")
    public void save(@RequestBody StockDTO stock) {
        stockService.save(stock);
    }
    
}
