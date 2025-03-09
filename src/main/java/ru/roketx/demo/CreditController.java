package ru.roketx.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rocketx.generated.model.Credit;

import java.util.List;

@RestController
@RequestMapping("/v1/internal")
public class CreditController implements ru.rocketx.generated.internal.api.CreditApiIntApi,
        ru.rocketx.generated.internal.api.TestApi {


    @Override
    public ResponseEntity<Credit> createCredit(Credit credit) {
        return null;
    }

    @Override
    public ResponseEntity<List<Credit>> getCredits() {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCredit(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Credit> getCreditById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Credit> updateCredit(String id, Credit credit) {
        return null;
    }
}
