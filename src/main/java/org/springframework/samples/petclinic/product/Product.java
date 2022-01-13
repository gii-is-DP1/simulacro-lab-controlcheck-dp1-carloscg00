package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseEntity {

    @NotNull
    @Length(min = 3, max = 50)
    String name;

    @NotNull
    @Min(0)
    double price;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "product_type_id")
    ProductType productType;
}
