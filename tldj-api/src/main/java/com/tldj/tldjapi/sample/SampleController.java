package com.tldj.tldjapi.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/sample")
public class SampleController {

  @GetMapping
  public ResponseEntity<String> sample() {
    return ResponseEntity.ok("This is Sample test");
  }

}
