package com.pooitec1.alibaba2.entity;

import com.pooitec1.alibaba2.entity.Employee;
import com.pooitec1.alibaba2.entity.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-03T14:22:42", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile ListAttribute<User, Rol> rols;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> nickname;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, Employee> employee;

}