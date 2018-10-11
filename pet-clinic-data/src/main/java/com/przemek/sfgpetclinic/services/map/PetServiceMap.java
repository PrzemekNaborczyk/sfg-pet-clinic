package com.przemek.sfgpetclinic.services.map;

import com.przemek.sfgpetclinic.model.Pet;
import com.przemek.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void delete(Pet obj) {
        super.deleteByObject(obj);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
