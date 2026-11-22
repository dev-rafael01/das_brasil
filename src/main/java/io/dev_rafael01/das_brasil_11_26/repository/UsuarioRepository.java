package io.dev_rafael01.das_brasil_11_26.repository;

import io.dev_rafael01.das_brasil_11_26.entity.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Long>
{
    UsuarioEntity findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
