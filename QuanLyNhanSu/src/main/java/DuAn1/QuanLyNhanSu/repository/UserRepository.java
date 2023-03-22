package DuAn1.QuanLyNhanSu.repository;

import DuAn1.QuanLyNhanSu.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
