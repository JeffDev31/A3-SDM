
package br.uam.sdm.services;

import br.uam.sdm.entities.Cliente;
import br.uam.sdm.repositories.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository repository;
    
    public List<Cliente> findAll() {
        return repository.findAll();
    }
    
    public Cliente findById(Long id) {
        Optional<Cliente> obj =  repository.findById(id);
        return obj.get();
    }
    
    public Cliente insert(Cliente obj) {
        return repository.save(obj);
    }
    
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public Cliente update(Long id, Cliente obj) {
        Cliente entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Cliente entity, Cliente obj) {
        entity.setId(obj.getId());
        entity.setNome(obj.getNome());
    }
    
}
