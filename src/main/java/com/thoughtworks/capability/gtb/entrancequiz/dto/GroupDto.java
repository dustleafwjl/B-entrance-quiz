package com.thoughtworks.capability.gtb.entrancequiz.dto;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupDto {
    public static List<String> initGroup = Arrays.asList("Team 1", "Team 2", "Team 3", "Team 4", "Team 5", "Team 6");
    public static List<Group> groups = new ArrayList<>();
}
