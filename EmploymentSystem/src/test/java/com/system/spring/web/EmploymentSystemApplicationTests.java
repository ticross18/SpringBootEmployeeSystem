import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.web.client.HttpClientErrorException;

import com.system.spring.web.entities.Employees;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Employees.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmploymentSystemApplicationTests{

@Autowired
private TestRestTemplate restTemplate;

@LocalServerPort
private int port;

private String getRootUrl() {
return "http://localhost:" + port;
}

@Test
public void contextLoads() {
}


@Test
public void testCreateUser() {
Employees e = new Employees();
e.setFname("Tiffany");
e.setMname("Marie");
e.setLname("Cross");
Date date = Date.valueOf("1992-06-04");
e.setDob(date);
e.setPosition("associate developer");
}
}