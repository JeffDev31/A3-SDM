
package br.uam.sdm.services;

import br.uam.sdm.entities.Produto;
import br.uam.sdm.repositories.ProdutoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository repository;
    
    public List<Produto> findAll() {
        return repository.findAll();
    }
    
    public Produto findById(Long id) {
        Optional<Produto> obj =  repository.findById(id);
        return obj.get();
    }
    
    public Produto insert(Produto obj) {
        return repository.save(obj);
    }
    
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public Produto update(Long id, Produto obj) {
        Produto entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Produto entity, Produto obj) {
        entity.setId(obj.getId());
        entity.setMarca(obj.getMarca());
    }
    
}
