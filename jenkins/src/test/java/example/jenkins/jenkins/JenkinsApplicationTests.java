package example.jenkins.jenkins;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class JenkinsApplicationTests {

	@Autowired
	private MockMvc mockMvc;


	@Test
	public void contextLoads() {
	}

	@Test
	public void testGreeting() throws Exception {
		   this.mockMvc.perform(get("/hello?name=Alex"))
           .andExpect(status().isOk()).andExpect(content().string("Hello Alex"));
	}

}
