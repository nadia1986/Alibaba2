package com.pooitec1.alibaba2.entity;

import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sale;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-03T14:22:42", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(SaleLine.class)
public class SaleLine_ { 

    public static volatile SingularAttribute<SaleLine, Sale> sale;
    public static volatile SingularAttribute<SaleLine, Product> product;
    public static volatile SingularAttribute<SaleLine, Integer> quantity;
    public static volatile SingularAttribute<SaleLine, Long> id;

}