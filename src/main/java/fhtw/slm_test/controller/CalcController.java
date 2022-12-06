package fhtw.slm_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/inchToCm/{num}")
    double calcCmFromInch(@PathVariable double num) {
        return num * 2.54;
    }

    @GetMapping("/yardToMeter/{num}")
    double calcYardToMeter(@PathVariable double num) {
        return num / 1.094;
    }
}
