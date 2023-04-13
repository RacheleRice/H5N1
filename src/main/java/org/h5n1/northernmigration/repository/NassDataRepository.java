package org.h5n1.northernmigration.repository;

import org.h5n1.northernmigration.entity.NassData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NassDataRepository extends JpaRepository<NassData, Long> {


}


