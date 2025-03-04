package ru.roketx.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.rocketx.generated.model.Credit;

@RestController
public class CreditController implements ru.rocketx.generated.internal.api.CreditApiIntApi,
        ru.rocketx.generated.internal.api.TestApi {

    @Override
    public Mono<ResponseEntity<Credit>> createCredit(Mono<Credit> credit, ServerWebExchange exchange) {
        return Mono.empty();
    }

    @Override
    public Mono<ResponseEntity<Flux<Credit>>> getCredits(ServerWebExchange exchange) {
        return null;
    }


    @Override
    public Mono<ResponseEntity<Void>> deleteCredit(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Credit>> getCreditById(String id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Credit>> updateCredit(String id, Mono<Credit> credit, ServerWebExchange exchange) {
        return null;
    }
}
