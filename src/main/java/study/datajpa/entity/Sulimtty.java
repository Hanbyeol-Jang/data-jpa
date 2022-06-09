package study.datajpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sulimtty {

    @Id
    @GeneratedValue
    @Column(name = "sulim_id")
    private Long sulimId;

    public Sulimtty(String su, String lim, String id) {
        this.su = su;
        this.lim = lim;
        this.id = id;
    }

    private String su;
    private String lim;
    private String id;

}
