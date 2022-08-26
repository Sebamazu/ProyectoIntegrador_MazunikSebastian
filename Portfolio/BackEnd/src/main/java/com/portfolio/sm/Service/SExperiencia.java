package com.portfolio.sm.Service;

import com.portfolio.sm.Entity.ExperienciaL;
import com.portfolio.sm.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<ExperienciaL> list(){
        return rExperiencia.findAll();
    }
    
    public Optional<ExperienciaL> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<ExperienciaL> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(ExperienciaL expe){
        rExperiencia.save(expe);
    }
    
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existById(int id){
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
}
