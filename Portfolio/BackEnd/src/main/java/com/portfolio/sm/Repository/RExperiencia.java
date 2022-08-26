package com.portfolio.sm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.portfolio.sm.Entity.ExperienciaL;
import java.util.Optional;

@Repository
public interface RExperiencia extends JpaRepository<ExperienciaL, Integer>{
    public Optional<ExperienciaL> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
