package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mock;

@RunWith(PowerMockRunner.class)
public class NewPowerMockTest {

    @Test
    public void oneTest() {
        ClassToMock it = mock(ClassToMock.class);
    }
}
