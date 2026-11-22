package io.dev_rafael01.das_brasil_11_26.repository;

import io.dev_rafael01.das_brasil_11_26.entity.ClienteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository<ClienteEntity, Long>
{
    ClienteEntity findBynome(String nome);

    @Transactional
    void deleteBynome(String nome);
}
