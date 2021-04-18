package guru.springframework.msscbeerservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class})
class MsscBeerServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
