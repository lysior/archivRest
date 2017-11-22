
package archivRest.service;

import archivRest.model.AllgPerson;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by JStratma on 15.03.2017.
 */

@RepositoryRestResource(collectionResourceRel = "AllgPerso", path = "AllgPerso")
public interface AllgPersonRepository extends PagingAndSortingRepository<AllgPerson, Long> {
    List<AllgPerson> findByName(@Param("name") String name);

}
