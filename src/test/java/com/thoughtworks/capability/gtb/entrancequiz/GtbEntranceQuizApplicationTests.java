package com.thoughtworks.capability.gtb.entrancequiz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GtbEntranceQuizApplicationTests {

	@Autowired
	MockMvc mockMvc;
	@Test
	void contextLoads() {
	}

	@Test
	void should_get_all_student() throws  Exception{
		mockMvc.perform(get("/students"))
				.andExpect(jsonPath("$", hasSize(35)))
				.andExpect(status().isOk());
//				.andExpect()
	}
}
