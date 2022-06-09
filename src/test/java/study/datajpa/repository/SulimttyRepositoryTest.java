package study.datajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.entity.Sulimtty;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@Rollback(false)
class SulimttyRepositoryTest {

    @Autowired
    SulimttyRepository sulimttyRepository;

    @Test
    public void sulimttyTest() {
        Sulimtty sulimtty = new Sulimtty("test1", "test2", "test3");
        Sulimtty saveSulimtty = sulimttyRepository.save(sulimtty);
        Sulimtty findSulimtty = sulimttyRepository.findById(saveSulimtty.getSulimId()).get();

        System.out.println("===============================");
        System.out.println(saveSulimtty.getSulimId());
        System.out.println("===============================");

        assertThat(findSulimtty.getSulimId()).isEqualTo(sulimtty.getSulimId());
    }
}