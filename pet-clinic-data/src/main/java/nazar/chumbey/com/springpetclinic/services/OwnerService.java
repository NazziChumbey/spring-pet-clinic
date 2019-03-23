package nazar.chumbey.com.springpetclinic.services;

import nazar.chumbey.com.springpetclinic.model.Owner;

public interface OwnerService extends GrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
