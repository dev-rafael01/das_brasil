package io.dev_rafael01.das_brasil_11_26.repository;

import io.dev_rafael01.das_brasil_11_26.infraestrutura.entity.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Long>
{
    Optional<UsuarioEntity> findByEmail(String email);


    @Transactional
    void deleteByEmail(String email);
}
