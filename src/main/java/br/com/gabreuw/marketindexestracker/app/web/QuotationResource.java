package br.com.gabreuw.marketindexestracker.app.web;

import br.com.gabreuw.marketindexestracker.domain.entities.Quotation;
import br.com.gabreuw.marketindexestracker.domain.usecases.GetMarketIndexQuotationUseCase;
import br.com.gabreuw.marketindexestracker.domain.usecases.QuotationUseCaseExecutor;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/quote")
@RestController
@RequiredArgsConstructor
public class QuotationResource {

    private final QuotationUseCaseExecutor useCaseExecutor;
    private final GetMarketIndexQuotationUseCase getMarketIndexQuotationUseCase;

    @GetMapping("/{assetCode}")
    public ResponseEntity<Quotation> getQuotation(@PathVariable String assetCode) {
        var input = new GetMarketIndexQuotationUseCase.InputValues(assetCode);

        Quotation result = useCaseExecutor.execute(
                getMarketIndexQuotationUseCase,
                input,
                GetMarketIndexQuotationUseCase.OutputValues::marketIndex
        );

        return ResponseEntity
                .ok()
                .body(result);
    }
}
