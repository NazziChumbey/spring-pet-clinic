package nazar.chumbey.com.springpetclinic.services.map;

import nazar.chumbey.com.springpetclinic.model.Owner;
import nazar.chumbey.com.springpetclinic.services.GrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements GrudService<Owner, Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
