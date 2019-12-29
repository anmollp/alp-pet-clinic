package com.anmol.alppetclinic.services;

import com.anmol.alppetclinic.model.Person;
import com.anmol.alppetclinic.model.Vet;

public interface VetService<V extends Person, L extends Number> extends CrudService<Vet, Long> {
}
