// Teresa Tull created this on 11-24-2022 work on ch 18

package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {
}