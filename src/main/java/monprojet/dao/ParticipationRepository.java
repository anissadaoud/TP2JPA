package monprojet.dao;

import monprojet.entity.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ParticipationRepository extends JpaRepository<Participation, Long> {

    @Query(value = "SELECT (SUM(pp.pourcentage), 0) " +
            "FROM Participation_Contributeur pc " +
            "JOIN Participation pp ON pc.Participation_id_part = pp.id_part " +
            "JOIN Projet p ON pp.id_projet = p.code " +
            "WHERE pc.Contributeur_matricule = :matricule " +
            "AND p.fin IS NULL", nativeQuery = true)
    double calculateTotalParticipation(@Param("matricule") Long matricule);
}
