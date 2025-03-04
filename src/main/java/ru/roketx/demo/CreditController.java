package ru.roketx.demo;


import org.openapitools.api.CreditsApi;
import org.openapitools.model.Credit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditController implements CreditsApi {

    @Override
    public ResponseEntity<Credit> createCredit(Credit credit) {
        return ResponseEntity.ok(credit);
    }

    @Override
    public ResponseEntity<Void> deleteCredit(String id) {
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Credit> getCreditById(String id) {
        return ResponseEntity.ok(new Credit());
    }

    @Override
    public ResponseEntity<List<Credit>> getCredits() {
        return ResponseEntity.ok(List.of(new Credit()));
    }

    @Override
    public ResponseEntity<Credit> updateCredit(String id, Credit credit) {
        return ResponseEntity.ok(credit);
    }
}
