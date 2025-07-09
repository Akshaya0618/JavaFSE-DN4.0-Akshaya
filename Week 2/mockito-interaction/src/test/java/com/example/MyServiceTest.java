package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Pass mock to service and call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify interaction
        verify(mockApi).getData();
    }
}
