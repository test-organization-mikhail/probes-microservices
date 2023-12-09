package telran.microservices.probes.service;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import telran.microservices.probes.dto.EmailData;

@WebMvcTest
class DataProviderControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    DataProvider dataProvider;

    EmailData emailData = new EmailData(new String[] {"vasia@gmail.com", "petia@gmail.com"}, new String[] {"vasia", "petia"});

    @Test
    void test() {
        when(dataProvider.getEmailData(123)).thenReturn(emailData);
    }

}