package com.przemek.sfgpetclinic.services.map;

import com.przemek.sfgpetclinic.model.Owner;
import com.przemek.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner obj) {
        super.deleteByObject(obj);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
