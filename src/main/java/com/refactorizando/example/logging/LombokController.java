package com.refactorizando.example.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LombokController {

  @GetMapping("/lombok")
  public String index() {
    log.trace("TRACE ");
    log.debug(" DEBUG ");
    log.info(" INFO ");
    log.warn(" WARN ");
    log.error(" ERROR ");

    return "hi";
  }
}
