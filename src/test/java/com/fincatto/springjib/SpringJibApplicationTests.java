package com.fincatto.springjib;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJibApplicationTests implements Loggable {
    
    @Test
    void fakeTest() {
        getLogger().debug("Fake test 1");
    }
}
