package com.pooitec1.alibaba2.entity;

import com.pooitec1.alibaba2.entity.Wharehouse;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-03T14:22:42", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> firstName;
    public static volatile SingularAttribute<Employee, String> lastName;
    public static volatile SingularAttribute<Employee, Long> id;
    public static volatile SingularAttribute<Employee, Wharehouse> wharehouse;
    public static volatile SingularAttribute<Employee, String> dni;

}