package com.thoughtworks.capability.gtb.entrancequiz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GtbEntranceQuizApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void should_get_all_student() throws  Exception{
		mockMvc.perform(get("/students"))
				.andExpect(status().isOk());
	}

	@Test
	void should_create_student_when_post_given_a_student() throws  Exception{
		mockMvc.perform(post("/students").content("{\"name\": \"test\", \"group\": \"\"}")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(36)))
				.andExpect(status().isOk());
	}

	@Test
	void should_divided_student_when_patch() throws  Exception{
		mockMvc.perform(patch("/students/divided"))
				.andExpect(jsonPath("$", hasSize(6)))
				.andExpect(status().isOk());
	}

	@Test
	void should_get_groups_when_get_group() throws  Exception{
		mockMvc.perform(get("/groups"))
				.andExpect(status().isOk());
	}
	@Test
	void should_rename_groups_when_patch_group() throws  Exception{
		mockMvc.perform(patch("/groups/team1/rename?text=1234"))
				.andExpect(status().isOk());
	}
}
