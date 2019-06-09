package com.fincatto.springjib;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringJibApplicationTests {
    
    @Test
    void fakeTest() {
        log.debug("Initializing Spring Context...");
    }
}
