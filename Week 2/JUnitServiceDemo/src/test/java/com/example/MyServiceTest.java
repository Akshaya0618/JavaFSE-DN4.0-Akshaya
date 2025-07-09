package com.example;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi api = Mockito.mock(ExternalApi.class);
        when(api.getData()).thenReturn("Hello");

        MyService service = new MyService(api);
        String result = service.process();

        assertEquals("HELLO", result);
    }
}

