package com.construtech.buildsphere.platform.resourceManagement.domain.model.queries;

import com.construtech.buildsphere.platform.resourceManagement.domain.model.valueobjects.ProjectRM;

public record GetAllMachinesByProjectIdQuery(ProjectRM project) {
}
