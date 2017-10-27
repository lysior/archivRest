
package archivRest.service;

import archivRest.model.AllgPerson;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by JStratma on 15.03.2017.
 */

@RepositoryRestResource(collectionResourceRel = "AllgPerso", path = "AllgPerso")
public interface AllgPersonRepository extends PagingAndSortingRepository<AllgPerson, Long> {

}
