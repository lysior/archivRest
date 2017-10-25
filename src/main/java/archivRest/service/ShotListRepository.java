
package archivRest.service;

import archivRest.model.ShotList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by JStratma on 15.03.2017.
 */

@RepositoryRestResource(collectionResourceRel = "ShotList", path = "ShotList")
public interface ShotListRepository extends PagingAndSortingRepository<ShotList, Long> {

}
