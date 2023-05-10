
package com.Porfolio.AP.repository;

import com.Porfolio.AP.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepo extends JpaRepository <AcercaDe, Long>{
    
}
