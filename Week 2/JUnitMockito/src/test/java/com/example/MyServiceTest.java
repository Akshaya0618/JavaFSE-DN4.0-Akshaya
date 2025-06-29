package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class MyServiceTest {

    @Test
    public void testFetchData() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mocked Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mocked Data", result);
        verify(mockApi).getData();
    }

    @Test
    public void testAddNumbers() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.add(10, 20)).thenReturn(30);

        MyService service = new MyService(mockApi);
        int result = service.addNumbers(10, 20);

        assertEquals(30, result);
        verify(mockApi).add(10, 20);
    }

    @Test
    public void testLogMessage() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.logMessage("Test Message");

        verify(mockApi).log("Test Message");
    }

    @Test
    public void testFetchData_nullResponse() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn(null);

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertNull(result);
    }
}
