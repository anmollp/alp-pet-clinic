package com.anmol.alppetclinic.services;

import com.anmol.alppetclinic.model.BaseEntity;
import com.anmol.alppetclinic.model.Pet;

public interface PetService<P extends BaseEntity, L extends Number> extends CrudService<Pet, Long> {
}
