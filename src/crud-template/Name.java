package $package$.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import $package$.dto.$Model$Dto;
import $package$.util.MapperUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "$model$")
public class $Model$ implements Serializable {

    private static final long serialVersionUID = 6523249791587614649L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @PrePersist
    void preInsert() {
        // Include default values:
        // if (this.ativo == null)
        // this.ativo = true;
    }

}