package ml.vovchinnikov.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ml.vovchinnikov.template.domain.TemplateDomain;

@Repository
public interface TemplateRepository extends JpaRepository<TemplateDomain, Integer> {
}
