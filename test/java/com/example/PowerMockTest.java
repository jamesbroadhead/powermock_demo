package com.example;


import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
public class PowerMockTest {

    @Test
    public void oneTest() {
      ClassToMock it = null;
      ArrayList<Integer> al = new ArrayList();
      for (int i = 0 ; i < 1000 ; i++) {
        it = mock(ClassToMock.class);
        when(it.getArray()).thenReturn(al);
        when(it.two()).thenReturn(mock(ArrayList.class));
        when(it.three()).thenReturn(mock(ArrayList.class));
        when(it.four()).thenReturn(mock(ArrayList.class));
        when(it.five()).thenReturn(mock(ArrayList.class));
      }
    }
}
