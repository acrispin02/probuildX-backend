package com.construtech.buildsphere.platform.resourceManagement.infrastructure.persistence.jpa.repositories;

import com.construtech.buildsphere.platform.resourceManagement.domain.model.aggregates.Material;
import com.construtech.buildsphere.platform.resourceManagement.domain.model.valueobjects.ProjectRM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
    boolean existsByMaterialNameAndProject(String materialName, ProjectRM project);
    boolean existsByMaterialNameAndIdNot(String materialName, Long id);
    List<Material> findAllByProject(ProjectRM project);
}
