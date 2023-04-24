package com.cydeo.entity.common;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

import java.io.Serializable;
import java.time.LocalDateTime;

//In addition, some Java frameworks and libraries, such as Spring,
// require that objects be serializable in order to be stored or transmitted between different components or processes.
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//In addition, some Java frameworks and libraries, such as Spring,
// require that objects be serializable in order to be stored or transmitted between different components or processes.
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, updatable = false)
    public LocalDateTime insertDateTime;
    @Column(nullable = false,updatable = false)
    public Long insertUserId;
    @Column(nullable = false)
    public LocalDateTime lastUpdateDateTime;
    @Column(nullable = false)
    public Long lastUpdateUserId;

    public Boolean isDeleted;


}