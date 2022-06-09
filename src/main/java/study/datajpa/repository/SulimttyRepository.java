package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Sulimtty;

@Repository
public interface SulimttyRepository extends JpaRepository<Sulimtty, Long> {

}
