package monprojet.dao;

        import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
        import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ParticipationRepositoryTest {

    @Autowired
    private ParticipationRepository participationRepository;

    @Test
    public void testCalculateTotalParticipation() {
        // Ajoutez des données de test dans le fichier data.sql pour tester efficacement la méthode
        double totalParticipation = participationRepository.calculateTotalParticipation(1L);
        assertEquals(100.0, totalParticipation, 0.001);
}
}

