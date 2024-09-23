package com.construtech.buildsphere.platform.iam.domain.model.commands;

import com.construtech.buildsphere.platform.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<String> roles) {
}
