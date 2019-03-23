package nazar.chumbey.com.springpetclinic.services.map;

import nazar.chumbey.com.springpetclinic.model.Pet;
import nazar.chumbey.com.springpetclinic.services.GrudService;

import java.util.Set;

public class PetServiceMap  extends AbstractMapService<Pet, Long> implements GrudService<Pet, Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
