package com.anmol.alppetclinic.services;

import com.anmol.alppetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
