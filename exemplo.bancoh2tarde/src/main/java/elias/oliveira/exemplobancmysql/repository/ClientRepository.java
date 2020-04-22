package elias.oliveira.exemplobancmysql.repository;

import elias.oliveira.exemplobancmysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
