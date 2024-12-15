package ma.grpc.project.Repository;

import ma.grpc.project.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {
}

