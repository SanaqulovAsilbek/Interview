package uz.pdp.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.interview.domain.User;

public interface InterviewRepository extends JpaRepository<User, Integer> {
}
