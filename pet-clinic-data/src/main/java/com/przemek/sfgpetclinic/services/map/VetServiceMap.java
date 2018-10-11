package com.przemek.sfgpetclinic.services.map;

import com.przemek.sfgpetclinic.model.Vet;
import com.przemek.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void delete(Vet obj) {
        super.deleteByObject(obj);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
