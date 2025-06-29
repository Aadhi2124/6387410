package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Use mock in service
        MyService service = new MyService(mockApi);
        service.fetchData();  // This should call getData()

        // Step 3: Verify interaction
        verify(mockApi).getData();
    }
}

