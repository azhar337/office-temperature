package org.acme.database.user;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * To create user database
 * */

@Entity
public class UserRepository extends PanacheEntity {

    @Column(unique = true)
    public String email;

    public String password;

    public boolean status = false;

    public String dataDir;
}
