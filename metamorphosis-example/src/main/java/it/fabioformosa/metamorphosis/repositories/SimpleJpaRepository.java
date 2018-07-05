package it.fabioformosa.metamorphosis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.fabioformosa.metamorphosis.entities.SimpleEntity;

@Repository
public interface SimpleJpaRepository extends JpaRepository<SimpleEntity, Long> {

}
