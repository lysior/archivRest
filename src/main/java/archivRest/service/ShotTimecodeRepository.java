
package archivRest.service;

import archivRest.model.ShotTimecode;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by JStratma on 15.03.2017.
 */

@RepositoryRestResource(collectionResourceRel = "ShotTimecode", path = "ShotTimecode")
public interface ShotTimecodeRepository extends PagingAndSortingRepository<ShotTimecode, Long> {
    List<ShotTimecode> findByShotlist(@Param("shotlist") Long shotlist);

}
