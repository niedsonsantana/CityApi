package com.niedson.cidadesApi.states.entity;


import com.niedson.cidadesApi.countries.entity.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;


@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
       @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

  /*1st
  @Column(name = "pais")
  private Integer countryId;
   */
    // 2nd - @ManyToOne

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;



    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    /*Adicionar a depencencia (implementation 'com.vladmihalcea:hibernate-types-52:2.9.8') para que o o código consiga
    * tratar o jeson que vem no campo ddd  */
    public List<Integer> getDdd() {
        return ddd;
    }


    public Country getCountry() {
        return country;
    }


/*
    public Integer getCountryId() {
      return countryId;
  }

 */
}